package com.doban.domain;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/8.
 */
public class Info {
     private int id;
     private Date createTime;
     private  Type type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
