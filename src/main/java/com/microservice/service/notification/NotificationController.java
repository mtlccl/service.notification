package com.microservice.service.notification;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    public ResponseEntity<Void> sendNotification(@RequestBody NotificationRequest request){
        return ResponseEntity.ok().build();
    }
}
