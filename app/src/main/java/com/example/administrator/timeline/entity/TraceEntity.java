package com.example.administrator.timeline.entity;

/**
 * Created by Administrator on 2016/12/20.
 */

public class TraceEntity {

    private String traceTime;

    private String traceMessage;

    public TraceEntity(String traceTime, String traceMessage) {
        this.traceTime = traceTime;
        this.traceMessage = traceMessage;
    }

    public String getTraceTime() {
        return traceTime;
    }

    public void setTraceTime(String traceTime) {
        this.traceTime = traceTime;
    }

    public String getTraceMessage() {
        return traceMessage;
    }

    public void setTraceMessage(String traceMessage) {
        this.traceMessage = traceMessage;
    }
}
