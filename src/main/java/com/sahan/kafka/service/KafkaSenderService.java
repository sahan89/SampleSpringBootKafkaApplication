package com.sahan.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSenderService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "sample_topic";

    @Autowired
    public KafkaSenderService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String message) {
        kafkaTemplate.send(kafkaTopic, message);
    }
}
