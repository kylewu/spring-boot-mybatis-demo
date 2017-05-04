package com.wenbinwu.controller;

import com.wenbinwu.mapper.SubscriptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

  @Autowired
  SubscriptionMapper mapper;

  @GetMapping("/{identifier}")
  public ResponseEntity findSubscriptionByIdentifier(@PathVariable String identifier) {
    return new ResponseEntity(mapper.findByIdentifier("test", identifier), HttpStatus.OK);
  }

  @GetMapping("/channel/{channel}")
  public ResponseEntity findSubscriptionByChannel(@PathVariable String channel) {
    return new ResponseEntity(mapper.findByChannel("test", channel), HttpStatus.OK);
  }
}
