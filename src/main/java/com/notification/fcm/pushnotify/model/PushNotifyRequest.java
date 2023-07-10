package com.notification.fcm.pushnotify.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PushNotifyRequest {
    private String title;
    private String message;
    private String topic;
    private String token;
}
