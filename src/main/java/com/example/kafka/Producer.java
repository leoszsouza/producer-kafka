package com.example.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private KafkaTemplate<String, TesteVO> kafkaTemplate;

    @Value("${kafka.topic}")
    private String topic;

    public void sendMessage(TesteVO testeVO){
        logger.info("Message producer test: " + testeVO);
        kafkaTemplate.send(topic, testeVO);
    }
}
