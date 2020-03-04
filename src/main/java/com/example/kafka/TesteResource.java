package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/kafka-leo")
public class TesteResource {

    @Autowired
    private ProducerService producerService;


    @PostMapping(value = "/publish")
    public ResponseEntity<String> saveTed(@Valid @RequestBody TesteVO testeVO) {

        producerService.publishRecord(testeVO);

        return ResponseEntity.ok(testeVO.toString());
    }


}
