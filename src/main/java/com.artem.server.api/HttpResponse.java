package com.artem.server.api;

import java.io.InputStream;
import java.util.Map;

public interface HttpResponse {

    public void setStatus(int responseStatus);

    public void setResource(InputStream responseResource);

    public void setHeaders(String key, String value);

    public void setCookie(String cookiesKey, String cookieValue);

    public int getStatus();

    public String getCommentForResponseStatus();

    public InputStream getResource();

    public String getHeader(String key);

    public Map<String, String> getHeaders();

    public String getCookie(String cookieKey);

    public Map<String, String> getAllCookies();

    public boolean hasOkStatus();
}
