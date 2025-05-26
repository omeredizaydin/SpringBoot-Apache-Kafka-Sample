package com.kafka_example.adapter.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "sampleTopic", groupId = "groupId-123")
    void listener(String data) {
        System.out.println("Listener Received: " + data + " :)");
    }
}
