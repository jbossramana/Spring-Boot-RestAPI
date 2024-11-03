package demo.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.model.MessageBean;

@RestController
public class MessageController {
	
	    @Autowired
	    private MessageBean messageBean;
	 
	    @GetMapping
	    public String getMsg()
	    {
	    	return messageBean.getMessage();
	    }
}
