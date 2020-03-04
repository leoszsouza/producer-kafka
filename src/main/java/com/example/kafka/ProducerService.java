package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    Producer producer;

    public void publishRecord(TesteVO testeVO){
        producer.sendMessage(testeVO);
    }

}
