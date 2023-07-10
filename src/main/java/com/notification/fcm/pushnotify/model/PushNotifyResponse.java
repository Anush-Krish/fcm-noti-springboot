package com.notification.fcm.pushnotify.model;

public class PushNotifyResponse {
    private int status;
    private String message;

    public PushNotifyResponse(){

    }
    public PushNotifyResponse(int status,String message){
        status=this.status;
        message=this.message;
    }
    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status=status;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
}
