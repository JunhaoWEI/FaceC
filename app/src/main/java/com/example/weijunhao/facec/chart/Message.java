package com.example.weijunhao.facec.chart;

/**
 * Created by weijunhao on 2018/3/21.
 */

public class Message {
    private String from_uid;
    private String to_uid;
    private String message;
    private String image;
    private long time;

    private boolean recevied;
    private boolean sendSuccess;
    private boolean deleted;

    public Message() {
    }

    public Message(String from_uid, String to_uid, String message, String image, long time, boolean recevied, boolean sendSuccess, boolean deleted) {
        this.from_uid = from_uid;
        this.to_uid = to_uid;
        this.message = message;
        this.image = image;
        this.time = time;
        this.recevied = recevied;
        this.sendSuccess = sendSuccess;
        this.deleted = deleted;
    }

    public String getFrom_uid() {
        return from_uid;
    }

    public void setFrom_uid(String from_uid) {
        this.from_uid = from_uid;
    }

    public String getTo_uid() {
        return to_uid;
    }

    public void setTo_uid(String to_uid) {
        this.to_uid = to_uid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isRecevied() {
        return recevied;
    }

    public void setRecevied(boolean recevied) {
        this.recevied = recevied;
    }

    public boolean isSendSuccess() {
        return sendSuccess;
    }

    public void setSendSuccess(boolean sendSuccess) {
        this.sendSuccess = sendSuccess;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
