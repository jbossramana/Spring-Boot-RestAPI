package demo.web;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncMethods {

    @Async
    public CompletableFuture<String> doSomething2() {
      System.out.println("doSomething2 is running! " + Thread.currentThread().getName() + " at time: " + LocalDateTime.now());
      return CompletableFuture.completedFuture("Result of doSomething2");
    }

}
