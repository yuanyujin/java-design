package com.yuanyujin.chains;

public class DyHandler extends RequestHandler{

    @Override
    public void hand(Request request) {
        if(request.getRequestType().contains(RequestType.DY)){
            printRequest(RequestType.DY);
        }
        super.hand(request);
    }
}
