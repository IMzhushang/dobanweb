package com.doban.domain;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Auth {
    private String resourcePath;
    private String oprate;
    private int userId;

    public Auth(String resourcePath, String oprate, int userId) {
        this.resourcePath = resourcePath;
        this.oprate = oprate;
        this.userId = userId;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getOprate() {
        return oprate;
    }

    public void setOprate(String oprate) {
        this.oprate = oprate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
