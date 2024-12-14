package com.example.KafkaDemoProj.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "demoTopic", groupId = "demoGroup")
    public void consumeMessage(String message) {
        System.out.println("Received Message: " + message);
    }
}
