package com.artem.server.api;

import java.util.Map;

public interface HttpHandler {

    public void doGet(HttpRequest request, HttpResponse response);

    public void doPost(HttpRequest request, HttpResponse response);
}
