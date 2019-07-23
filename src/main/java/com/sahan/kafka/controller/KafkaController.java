package com.sahan.kafka.controller;

import com.sahan.kafka.service.KafkaSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafkaController/")
public class KafkaController {
    private final KafkaSenderService kafkaSenderService;

    @Autowired
    public KafkaController(KafkaSenderService kafkaSenderService) {
        this.kafkaSenderService = kafkaSenderService;
    }

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("message") String message) {
        kafkaSenderService.send(message);
        return "Message sent to the Kafka Topic \"sample_topic\" Successfully : " + message;
    }
}
