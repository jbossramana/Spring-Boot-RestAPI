package com.boot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.boot.service.KafkaSender;

@RestController
@RequestMapping(value = "/kafka/")
public class ApacheKafkaWebController {

	@Autowired
	KafkaSender kafkaSender;

	@PostMapping(value = "/producer")
	public String producer(@RequestBody String message) {
		kafkaSender.send(message);

		return "Message sent to the Kafka Topic test_topic Successfully";
	}


}

