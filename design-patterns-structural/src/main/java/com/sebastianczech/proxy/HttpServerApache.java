package com.sebastianczech.proxy;

public class HttpServerApache implements HttpServer {

    @Override
    public HttpResult downloadFile(String fileName) {
        return new HttpResult("[apache header] ");
    }

}
