package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication 
@RestController // Le dice a Spring que este código describe un 'endpoint' que debería de estar disponible para responder a requests HTTP
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/hello") // Especifica a Spring para responder a requests que se envién a la URL http://localhost:8080/hello
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) { // El parámetro 'name' es opcional, si no se envía se toma el valor por defecto 'World'
      return String.format("Hello %s!", name);
    }
}