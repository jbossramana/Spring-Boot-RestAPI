package com.rest.example;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class SimpleController {


@GetMapping (path="/filterBean")
public MappingJacksonValue  filterBean(@RequestParam String[] dynamic)
{
	
SimpleBean simpleBean = new SimpleBean("morning","afternoon","evening");

SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(dynamic);

FilterProvider filters = new SimpleFilterProvider().addFilter("SimpleFilter",filter);

MappingJacksonValue mapping = new MappingJacksonValue(simpleBean);

mapping.setFilters(filters);

return mapping;

                                                      

}


}
