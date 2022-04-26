package xyz.openlib.plainspringproxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.openlib.springcore.service.HelloService;
import xyz.openlib.plainspringproxy.context.OpenlibContext;

public class OpenlibContextProvider {
  public synchronized void init() {
    if (OpenlibContext.getContext() == null) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      context.register(HelloService.class);
      context.refresh();

      OpenlibContext.setContext(context);
    }
  }
}
