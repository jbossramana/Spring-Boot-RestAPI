package ctx1;

import org.springframework.stereotype.Service;

import parent.IHomeService;

@Service
public class GreetingService implements IHomeService {

    public String getGreeting() {
        return "Greetings for the day";
    }
}