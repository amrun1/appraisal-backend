package com.permata.appraisal.common;

public class PaginatedListRequest<T> {
    private T wrapper;
    private PagingInfo pagingInfo;

    public T getWrapper() {
        return wrapper;
    }

    public void setWrapper(T wrapper) {
        this.wrapper = wrapper;
    }

    public PagingInfo getPagingInfo() {
        return pagingInfo;
    }

    public void setPagingInfo(PagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
    }
}
