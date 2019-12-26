package com.codeaches.activmq.embedded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

  @Autowired
  JmsTemplate jmsTemplate;

  @PostMapping("/send")
  public void sendDataToJms(@RequestParam String message) {
    jmsTemplate.convertAndSend(message);
  }
}
