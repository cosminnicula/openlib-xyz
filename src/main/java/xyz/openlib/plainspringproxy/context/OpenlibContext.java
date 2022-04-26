package xyz.openlib.plainspringproxy.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OpenlibContext {
  private static AnnotationConfigApplicationContext context;

  public static void setContext(AnnotationConfigApplicationContext newContext) {
    context = newContext;
  }

  public static AnnotationConfigApplicationContext getContext() {
    return context;
  }
}
