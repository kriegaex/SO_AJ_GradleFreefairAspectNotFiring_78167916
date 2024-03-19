package org.example.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DemoAspect {
  @Before("execution(* *(..)) && !within(org.example.aspectj.DemoAspect)")
  public void logEnter(JoinPoint joinPoint) {
    System.out.println(joinPoint);
  }
}
