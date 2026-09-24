package com.permata.appraisal.service.impl;

import com.permata.appraisal.common.PaginatedListResponse;
import com.permata.appraisal.common.PagingInfo;
import com.permata.appraisal.dto.DataCommonTableDto;
import com.permata.appraisal.service.DataCommonService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataCommonServiceImpl implements DataCommonService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public PaginatedListResponse<DataCommonTableDto> findForTables(PagingInfo pagingInfo, DataCommonTableDto filter) {
        List<String> sql = new ArrayList<>();
        sql.add("select a.id, a.orderNumber, a.name, a.appraisalType.name, a.appraisalTypeCategory, " +
                "a.dataDetail.alamat, a.dataDetail.province, a.dataDetail.subDistrict, a.dataDetail.district, " +
                "a.dataDetail.city, a.position, a.typeReport, a.dataDetail.assetType.name, " +
                "a.dataDetail.assetType.categoryType.name, c.lpaNumber, a.marketingBranch.name, d.name, " +
                "a.createdBy, p.name ");
        List<String> from = new ArrayList<>();
        from.add(" from DataCommon a left join a.dataDetail b left join b.lpaUmum c left join a.branch d " +
                "join Person p on p.userId = a.createdBy ");
        List<String> where = new ArrayList<>();

        if (StringUtils.isNotBlank(filter.getNoOrder())) {
            where.add("lower(a.orderNumber) like :noOrder");
        }
        if (StringUtils.isNotBlank(filter.getNamaDebitur())) {
            where.add("lower(a.name) like :namaDebitur");
        }
        if (StringUtils.isNotBlank(filter.getLokasi())) {
            where.add("lower(a.dataDetail.alamat) like :lokasi");
        }
        if (StringUtils.isNotBlank(filter.getPosisi())) {
            where.add("a.position = :posisi");
        }
        if (StringUtils.isNotBlank(filter.getNoLaporan())) {
            where.add("c.lpaNumber like :noLaporan");
        }
        if (StringUtils.isNotBlank(filter.getUserId())) {
            where.add("lower(a.createdBy) = :userId");
        }
        if (StringUtils.isNotBlank(filter.getNamaMarketing())) {
            where.add("lower(p.name) like :namaMarketing");
        }
        if (StringUtils.isNotBlank(filter.getCabangBisnis())) {
            where.add("a.marketingBranch.id = :cabangBisnis");
        }
        if (StringUtils.isNotBlank(filter.getCabangAppraisal())) {
            where.add("d.id = :cabangAppraisal");
        }
        if (StringUtils.isNotBlank(filter.getJenisAktiva())) {
            where.add("b.assetType.id = :jenisAktiva");
        }
        if (StringUtils.isNotBlank(filter.getKategoriAktiva())) {
            where.add("b.assetType.categoryType.id = :kategoriAktiva");
        }
        if (StringUtils.isNotBlank(filter.getJenisAppraisal())) {
            where.add("a.appraisalType.id = :jenisAppraisal");
        }
        if (StringUtils.isNotBlank(filter.getSourceId())) {
            if (StringUtils.equalsIgnoreCase(filter.getSourceId(), "null")) {
                where.add("a.sourceId is null");
            } else if (StringUtils.equalsIgnoreCase(filter.getSourceId(), "null_inquiry")) {
                where.add("(a.sourceId is null or a.sourceStatus > 0)");
            }
        }

        String hqlQuery;
        if (where.isEmpty()) {
            hqlQuery = String.join(" ", sql) + String.join(" ", from);
        } else {
            hqlQuery = String.join(" ", sql) + String.join(" ", from) + " where " + String.join(" and ", where);
        }

        String hqlCount = "select count(a.id) " + String.join(" ", from) +
                (where.isEmpty() ? "" : " where " + String.join(" and ", where));

        Query countQuery = entityManager.createQuery(hqlCount);
        setParameters(countQuery, filter);
        Number total = (Number) countQuery.getSingleResult();

        Query dataQuery = entityManager.createQuery(hqlQuery);
        setParameters(dataQuery, filter);

        int currentPage = pagingInfo != null && pagingInfo.getCurrentPage() != null ?
                pagingInfo.getCurrentPage() - 1 : 0;
        int pageSize = pagingInfo != null && pagingInfo.getPageSize() != null ?
                pagingInfo.getPageSize() : 10;

        List<DataCommonTableDto> resultSet = new ArrayList<>();
        if (pagingInfo != null && pagingInfo.isRetrieveAll()) {
            resultSet.addAll(mapData((List<Object[]>) dataQuery.getResultList()));
        } else {
            List<Object[]> page = dataQuery.setFirstResult(currentPage * pageSize)
                    .setMaxResults(pageSize).getResultList();
            resultSet.addAll(mapData(page));
        }

        PaginatedListResponse<DataCommonTableDto> response = new PaginatedListResponse<>();
        response.setDataList(resultSet);
        response.setTotalRowCount(total == null ? 0 : total.intValue());
        if (pagingInfo != null) {
            int pages = pageSize > 0 ? (int) Math.ceil((total == null ? 0 : total.intValue()) / (double) pageSize) : 0;
            pagingInfo.setPageCount(pages);
            response.setPagingInfo(pagingInfo);
        }
        return response;
    }

    private void setParameters(jakarta.persistence.Query query, DataCommonTableDto filter) {
        if (StringUtils.isNotBlank(filter.getNoOrder())) {
            query.setParameter("noOrder", "%" + filter.getNoOrder().toLowerCase() + "%");
        }
        if (StringUtils.isNotBlank(filter.getNamaDebitur())) {
            query.setParameter("namaDebitur", "%" + filter.getNamaDebitur().toLowerCase() + "%");
        }
        if (StringUtils.isNotBlank(filter.getLokasi())) {
            query.setParameter("lokasi", "%" + filter.getLokasi().toLowerCase() + "%");
        }
        if (StringUtils.isNotBlank(filter.getPosisi())) {
            query.setParameter("posisi", filter.getPosisi());
        }
        if (StringUtils.isNotBlank(filter.getNoLaporan())) {
            query.setParameter("noLaporan", "%" + filter.getNoLaporan() + "%");
        }
        if (StringUtils.isNotBlank(filter.getUserId())) {
            query.setParameter("userId", filter.getUserId().toLowerCase());
        }
        if (StringUtils.isNotBlank(filter.getNamaMarketing())) {
            query.setParameter("namaMarketing", "%" + filter.getNamaMarketing().toLowerCase() + "%");
        }
        if (StringUtils.isNotBlank(filter.getCabangBisnis())) {
            query.setParameter("cabangBisnis", Long.valueOf(filter.getCabangBisnis()));
        }
        if (StringUtils.isNotBlank(filter.getCabangAppraisal())) {
            query.setParameter("cabangAppraisal", Long.valueOf(filter.getCabangAppraisal()));
        }
        if (StringUtils.isNotBlank(filter.getJenisAktiva())) {
            query.setParameter("jenisAktiva", Long.valueOf(filter.getJenisAktiva()));
        }
        if (StringUtils.isNotBlank(filter.getKategoriAktiva())) {
            query.setParameter("kategoriAktiva", filter.getKategoriAktiva());
        }
        if (StringUtils.isNotBlank(filter.getJenisAppraisal())) {
            query.setParameter("jenisAppraisal", Long.valueOf(filter.getJenisAppraisal()));
        }
    }

    private List<DataCommonTableDto> mapData(List<Object[]> rows) {
        List<DataCommonTableDto> result = new ArrayList<>();
        for (Object[] row : rows) {
            DataCommonTableDto dto = new DataCommonTableDto();
            dto.setId(row[0] == null ? null : ((Number) row[0]).longValue());
            dto.setNoOrder((String) row[1]);
            dto.setNamaDebitur((String) row[2]);
            dto.setJenisAppraisal((String) row[3]);
            dto.setKategoriAppraisal((String) row[4]);
            dto.setLokasi((String) row[5]);
            dto.setPropinsi((String) row[6]);
            dto.setKelurahan((String) row[7]);
            dto.setKecamatan((String) row[8]);
            dto.setKota((String) row[9]);
            dto.setPosisi((String) row[10]);
            dto.setJenisLaporan((String) row[11]);
            dto.setJenisAktiva((String) row[12]);
            dto.setKategoriAktiva((String) row[13]);
            dto.setNoLaporan((String) row[14]);
            dto.setCabangBisnis((String) row[15]);
            dto.setCabangAppraisal((String) row[16]);
            dto.setUserId((String) row[17]);
            dto.setNamaMarketing((String) row[18]);
            result.add(dto);
        }
        return result;
    }
}