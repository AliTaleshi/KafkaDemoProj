package com.example.KafkaDemoProj.controller;

import com.example.KafkaDemoProj.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TestController {
    private final KafkaProducerService kafkaProducerService;

    public TestController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/publish")
    public String sendMessage(@RequestParam String message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to Kafka!";
    }
}
