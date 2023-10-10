package com.amigoscode.clients.notification;

import lombok.Builder;

@Builder
public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerEmail,
        String message
) {
}
