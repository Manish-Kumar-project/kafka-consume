package com.example.consumer.service;


import com.example.consumer.User;
import com.example.consumer.entity.UserInformation;
import com.example.consumer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private KafkaTemplate<String, Object> template;

    private String topic = "javatechie17";

    public void userSave(UserInformation userInformation) {
        userRepository.save(userInformation);
    }

    @KafkaListener(groupId = "javatechie17", topics = "javatechie17", containerFactory = "userKafkaListenerContainerFactory")
    public UserInformation getJsonMsgFromTopic(UserInformation user) {
        System.out.println(user);
        return user;
    }
}
