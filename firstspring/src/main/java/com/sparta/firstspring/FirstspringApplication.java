package com.sparta.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringApplication.class, args);
	}

	@RestController
	public class HelloWorldController {
		@RequestMapping("/hello")
		public String printHello(){
			System.out.println("Someone has visited /hello");
			return "hello Spring One";
		}

		@RequestMapping("/helloWorld")
		public String printHelloWorld(){
			return "hello world!";
		}
	}

}
