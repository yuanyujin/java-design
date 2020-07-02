package com.yuanyujin.chains;

import java.util.List;

public class Request {

    private List<RequestType> requestType;

    public Request(List<RequestType> requestType) {
        this.requestType = requestType;
    }

    public List<RequestType> getRequestType() {
        return requestType;
    }

    public void setRequestType(List<RequestType> requestType) {
        this.requestType = requestType;
    }
}
