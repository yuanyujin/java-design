package com.yuanyujin.chains;

public class PbHandler extends RequestHandler{

    @Override
    public void hand(Request request) {
        if(request.getRequestType().contains(RequestType.PB)){
            printRequest(RequestType.PB);
        }
        super.hand(request);
    }
}
