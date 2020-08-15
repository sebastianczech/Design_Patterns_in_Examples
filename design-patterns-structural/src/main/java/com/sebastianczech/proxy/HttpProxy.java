package com.sebastianczech.proxy;

public class HttpProxy implements HttpServer {

    HttpServer httpServer;

    public HttpProxy(HttpServer httpServer) {
        this.httpServer = httpServer;
    }

    @Override
    public HttpResult downloadFile(String fileName) {
        HttpResult result = httpServer.downloadFile(fileName);
        return new HttpResult("[proxy header] " + result.getInfo());
    }
}
