package com.yuanyujin.chains;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler linkHandler(RequestHandler requestHandler){
        this.next = requestHandler;
        return next;
    }

    public void hand(Request request){
        if(next != null){
            next.hand(request);
        }
    }

    public void printRequest(RequestType requestType){
        System.out.println(requestType);
    }
}
