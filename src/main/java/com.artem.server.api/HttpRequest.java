package com.artem.server.api;

import java.util.Map;

public interface HttpRequest {

    public void setResource(String resource);

    public void setSession(HttpSession httpSession);

    public String getResource();

    public String getMethod();

    public String getHeaders(String key);

    public String getCookie(String cookieKey);

    public Map<String, String> getAllCookies();

    public HttpSession getSession();

    public String getParameters(String key);

    public Map<String, String> setCookies(String cookies);


}
