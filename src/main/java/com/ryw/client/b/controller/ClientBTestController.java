package com.ryw.client.b.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("client-b")
public class ClientBTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientBTestController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Registration registration;
	
	@RequestMapping(value = "hello-test", method = RequestMethod.GET)
	public String clientATest() {
		logger.info("hello world B client");
		logger.info("/hello-test, host:" + registration.getHost() + ", service_id:" + registration.getServiceId());
		return "hello world B client";
	}

}
