package demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class HelloFromAspectJ {

	@Pointcut("execution(* get*(..))")
  public void mainMethod() {}
	
    @Before("mainMethod()")
  public void beforesayHello(JoinPoint pt) {
    System.out.println("Before : Hello from AspectJ!" + pt.getTarget());
    
  }

  @After("mainMethod()")
  public void aftersayHello() {
    System.out.println("After : Hello from AspectJ!");
  }
  
  
  @AfterReturning("mainMethod()")
  public void afterreturnsayHello(JoinPoint pt) {
    System.out.println("AfterReturn : Hello from AspectJ!" + pt.getTarget());
  }
  
  @Around("mainMethod()") 
  public void logAroundGetEmployee(ProceedingJoinPoint joinPoint) throws Throwable 
  {
      System.out.println("Around:Before Method Execution: "+ joinPoint.getSignature().getName());
      try {
          joinPoint.proceed();
      } finally {
          //Do Something useful, If you have
      }
      System.out.println("Around:After Method Execution: "+ joinPoint.getSignature().getName());
  }
  

}