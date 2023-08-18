package com.myproject;

import java.util.ArrayList;
import java.util.List;

// Clase base para representar una pizza
public class Pizza {
    private String nombre;
    private double precio;
    private List<String> ingredientes;

    // Constructor de la clase Pizza
    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList<>(ingredientes);
    }

    // Método para preparar la pizza
    public void preparar() {
        System.out.println("Preparando la pizza : " + nombre + " de pepperoni");
        System.out.println("Añadiendo ingredientes: " + ingredientes);
        System.out.println("La pizza está lista para ser servida.");
    }

    // Representación en cadena de la pizza
    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", Precio: " + precio;
    }

    // Getter para los ingredientes
    public List<String> getIngredientes() {
        return ingredientes;
    }
}
