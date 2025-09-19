package demo.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    // Inject the AsyncMethods component
    @Autowired
    private AsyncMethods asyncMethods;

    
    @Scheduled(cron = "0 * * * * *")
    public void runEveryMinute() {
        log.info("This runs every minute.");
    }
    
    @Scheduled(cron = "0 */5 * * * *")
    public void runEveryFiveMinutes() {
        log.info("This runs every 5 minutes.");
    }
    
    
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        // Log the current time
        log.info("The time is now {}", dateFormat.format(new Date()));

        // Call the asynchronous method
        CompletableFuture<String> future = asyncMethods.doSomething2();

        // Handle the result asynchronously
        future.thenAccept(result -> {
            log.info("Async method completed with result: {}", result);
        }).exceptionally(ex -> {
            log.error("Error during async operation", ex);
            return null;
        });
    }
}
