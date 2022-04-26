package xyz.openlib.plainspringproxy.service;

import xyz.openlib.springcore.service.HelloService;
import xyz.openlib.plainspringproxy.context.OpenlibContext;

public class HelloServiceProxy {
  public static HelloService getBean() {
    return OpenlibContext.getContext().getBean(HelloService.class);
  }
}
