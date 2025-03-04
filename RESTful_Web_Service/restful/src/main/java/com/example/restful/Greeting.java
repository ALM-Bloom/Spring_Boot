package com.example.restful;

// public record Greeting(long id, String content) {

import java.util.Objects;

// }

// Lo que hace 'record' es crear una clase que tiene los siguientes métodos automatizadamente:
// - Un constructor que inicializa los campos de la clase.
// - Métodos de acceso para los campos de la clase. (Con los nombres de los metodos siendo los nombres de los campos)	
// - No se generan setters, por lo que los campos son inmutables.
// - Se generan los métodos equals(), hashCode() y toString().
public class Greeting {

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    
    public long id() {
        return id;
    }

    public String content() {
        return content;
    }
    
    @Override
    public String toString() {
        return "Greeting[id=" + id + ", content=" + content + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Greeting greeting = (Greeting) obj;
        return id == greeting.id && Objects.equals(content, greeting.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    private final long id;
    private final String content;
    
}