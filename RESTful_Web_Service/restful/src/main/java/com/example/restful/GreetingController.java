package com.example.restful;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Identificativo que representa que las requests HTTP son manejadas por este controlador.
public class GreetingController {

	private static final String TEMPLATE = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting") // Identificativo que representa que este método maneja las requests HTTP GET en la ruta /greeting.
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
	}
}