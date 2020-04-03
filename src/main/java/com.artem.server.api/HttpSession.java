package com.artem.server.api;

import java.util.Date;

public interface HttpSession {

    public void addParameters(String string, Object object);

    public Object getParameters(String string);

    public Date getLastRequestTime();

    public void setLastRequestTime(Date lastRequestTime);
}
