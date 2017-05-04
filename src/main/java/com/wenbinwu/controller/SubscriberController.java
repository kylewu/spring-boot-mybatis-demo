package com.wenbinwu.controller;

import com.wenbinwu.mapper.SubscriberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscribers")
public class SubscriberController {

  @Autowired
  SubscriberMapper mapper;

  @GetMapping("/{username}")
  public ResponseEntity findSubscriberByUsername(@PathVariable String username) {
    return new ResponseEntity(mapper.findByUsername("test", username), HttpStatus.OK);

  }
}
