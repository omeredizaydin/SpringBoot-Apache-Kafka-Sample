package com.kafka_example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	//	@Bean
	//	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
	//		return args -> {
	//			for (int i = 0; i < 100; i++) {
	//				kafkaTemplate.send("sampleTopic", "Hello Kafka, It's so exciting " + i);
	//			}
	//		};
	//	}
	// To consume
	// https://kafka.apache.org/quickstart
	// step 5
	// bin/kafka-console-consumer.sh --topic sampleTopic --from-beginning --bootstrap-server localhost:9092
}
