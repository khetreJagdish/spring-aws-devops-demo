package com.bmc.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

	 public String hello() {
		 return "Hello From  AWS Devops Demo Application";
	 }
}
