package com.amigoscode.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudulentCustomer(Integer customerId) {
        FraudCheckHistory fraudCheckHistory = FraudCheckHistory
                .builder()
                .customerId(customerId)
                .createdAt(LocalDateTime.now())
                .isFraudster(true)
                .build();
        fraudCheckHistoryRepository.save(fraudCheckHistory);
        return false;
    }
}
