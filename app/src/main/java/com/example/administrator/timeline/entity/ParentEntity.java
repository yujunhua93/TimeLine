package com.example.administrator.timeline.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/12/20.
 */

public class ParentEntity {

    private String time;

    private List<ChildEntity> list;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<ChildEntity> getList() {
        return list;
    }

    public void setList(List<ChildEntity> list) {
        this.list = list;
    }
}
