package com.amigoscode.notification;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/notification")
@AllArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping
    public void registerCustomer(@RequestBody NotificationRequest notificationRequest) throws IllegalAccessException {
        log.info("new notification registiration {}", notificationRequest);
        notificationService.send(notificationRequest);
    }
}
