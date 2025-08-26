package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ConsumerApplication {
	List<String> messages = new ArrayList<>();

	User userFromTopic = null;

	@GetMapping("/consumeStringMessage")
	public List<String> consumeMsg() {
		return messages;
	}

	@GetMapping("/consumeJsonMessage")
	public User consumeJsonMessage() {
		return userFromTopic;
	}

	@KafkaListener(groupId = "javatechie-1", topics = "javatechie", containerFactory = "kafkaListenerContainerFactory")
	public List<String> getMsgFromTopic(String data) {
		messages.add(data);
		return messages;
	}

	@KafkaListener(groupId = "javatechie17", topics = "javatechie17", containerFactory = "userKafkaListenerContainerFactory")
	public User getJsonMsgFromTopic(User user) {
		userFromTopic = user;
		System.out.println(userFromTopic);
		return userFromTopic;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
