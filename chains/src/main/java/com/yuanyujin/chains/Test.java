package com.yuanyujin.chains;

import java.util.Arrays;

public class Test {

    private static LcService lcService = new LcService();

    public static void init(){
        RequestHandler requestHandler = new HgHandler();
        requestHandler.linkHandler(new PbHandler().linkHandler(new DyHandler()));
        lcService.setRequestHandler(requestHandler);
    }

    public static void main(String[] args) {
        init();
        Request request = new Request(Arrays.asList(RequestType.DY,RequestType.HG));
        lcService.excute(request);
    }
}
