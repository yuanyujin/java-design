package com.yuanyujin.chains;

public class LcService {

    private RequestHandler requestHandler;

    public void excute(Request request){
        requestHandler.hand(request);
    }

    public RequestHandler getRequestHandler() {
        return requestHandler;
    }

    public void setRequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }
}
