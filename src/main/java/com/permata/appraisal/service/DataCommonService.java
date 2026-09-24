package com.permata.appraisal.service;

import com.permata.appraisal.common.PaginatedListResponse;
import com.permata.appraisal.common.PagingInfo;
import com.permata.appraisal.dto.DataCommonTableDto;

public interface DataCommonService {

    PaginatedListResponse<DataCommonTableDto> findForTables(PagingInfo pagingInfo, DataCommonTableDto filter);
}