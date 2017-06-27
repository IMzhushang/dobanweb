package com.doban.domain;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Feed {
    private  String  content;
    private  int owerId;
    private  Long time;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOwerId() {
        return owerId;
    }

    public void setOwerId(int owerId) {
        this.owerId = owerId;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
