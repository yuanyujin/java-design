package com.yuanyujin.chains;

public class HgHandler extends RequestHandler{

    @Override
    public void hand(Request request) {
        if(request.getRequestType().contains(RequestType.HG)){
            printRequest(RequestType.HG);
        }
        super.hand(request);
    }
}
