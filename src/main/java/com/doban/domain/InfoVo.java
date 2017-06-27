package com.doban.domain;

/**
 * Created by Administrator on 2017/6/8.
 */
public class InfoVo {
    private int id;
    private String date;
    private Integer type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "InfoVo{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", type=" + type +
                '}';
    }
}
