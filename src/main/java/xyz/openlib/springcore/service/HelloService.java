package xyz.openlib.springcore.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
  public String getMessage(String s) {
    return String.format("Hello from %s!", s);
  }
}
