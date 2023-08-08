package com.sns.demo.controller;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSSNSController {

  private final static String TOPIC_ARN = "arn:aws:sns:ap-south-1:029756575211:ust-sns-1";

  @Autowired
  AmazonSNSClient amazonSNSClient;

  @PostMapping("/addSubscription")
  public String addSubscriptionToSNSTopic(@RequestBody String email) {
    SubscribeRequest subscribeRequest = new SubscribeRequest(TOPIC_ARN, "email", email);
    amazonSNSClient.subscribe(subscribeRequest);
    return "Subscription request is pending. To confirm the subscription please check your email :"
        + email;
  }

  @GetMapping("/sendNotification")
  public String publishMessageToSNSTopic() {
    PublishRequest publishRequest = new PublishRequest(TOPIC_ARN, buildMessageBody(),
        "Codezup code the way up");
    amazonSNSClient.publish(publishRequest);
    return "notification send successfully.";
  }

  private String buildMessageBody() {
    return "Dear coders, please support codezup. Codezup is a technical tutorial website."
        + "Thanks";
  }

}