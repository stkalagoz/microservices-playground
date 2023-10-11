package com.amigoscode.notification;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        Notification notification = Notification
                .builder()
                .sender("Amigoscode")
                .message(notificationRequest.message())
                .toCustomerId(notificationRequest.toCustomerId())
                .toCustomerEmail(notificationRequest.message())
                .sentAt(LocalDateTime.now())
                .build();
        notificationRepository.save(notification);
    }
}
