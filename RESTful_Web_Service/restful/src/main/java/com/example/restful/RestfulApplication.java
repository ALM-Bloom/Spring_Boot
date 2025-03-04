package com.example.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Idea of the project is to create a RESTful API using Spring Boot.
 * The service will handle GET requests for /greeting, optionally with a name parameter in the query string.
 * The GET request should return a 200 OK response with JSON in the body that represents a greeting.
 * E.g:
 * {
 *  "id": 1,
 *  "content": "Hello, World!"
 * }
 * Where id field is a unique identifier for the greeting, and content field is the textual representation of the greeting.
 */

@SpringBootApplication
public class RestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApplication.class, args);
	}

}
