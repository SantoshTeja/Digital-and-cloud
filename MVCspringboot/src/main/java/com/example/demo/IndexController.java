package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IndexController {
    @RequestMapping("/name/{id}/{course}")
	public String hello(@PathVariable ("id") String id,@PathVariable ("course") String course)
	{
		return "Hello Santosh Teja "+id+"\t"+course;
	}
}
