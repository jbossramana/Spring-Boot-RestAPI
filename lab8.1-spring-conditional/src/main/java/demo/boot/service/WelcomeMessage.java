package demo.boot.service;

import demo.boot.model.MessageBean;

public class WelcomeMessage implements MessageBean {

    private String message;

    public WelcomeMessage(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
