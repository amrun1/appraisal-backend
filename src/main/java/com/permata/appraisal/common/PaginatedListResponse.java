package com.permata.appraisal.common;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaginatedListResponse<T> {
    private List<T> dataList;
    private PagingInfo pagingInfo;
    private int totalRowCount;

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public PagingInfo getPagingInfo() {
        return pagingInfo;
    }

    public void setPagingInfo(PagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
    }

    public int getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(int totalRowCount) {
        this.totalRowCount = totalRowCount;
    }
}

