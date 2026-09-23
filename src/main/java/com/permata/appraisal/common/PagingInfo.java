package com.permata.appraisal.common;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PagingInfo implements Serializable {
    private Integer currentPage;
    private Integer pageCount;
    private Integer pageSize;
    private boolean retrieveAll;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isRetrieveAll() {
        return retrieveAll;
    }

    public void setRetrieveAll(boolean retrieveAll) {
        this.retrieveAll = retrieveAll;
    }
}