package com.rest.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {


@GetMapping (path="/dispBean")
public SimpleBean  filterBean()
{
	return new SimpleBean("morning","afternoon","evening");
}


}
