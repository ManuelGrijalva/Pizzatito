package com.myproject;

import com.myproject.Pizza;

import java.util.List;

// Clase que hereda de Pizza para representar una pizza italiana
public class PizzaItaliana extends Pizza {
    private String salsa;
    private int tiempoEnHorno;

    // Constructor de la clase PizzaItaliana
    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    // Método para preparar la pizza italiana
    @Override
    public void preparar() {
        System.out.println("Preparando la pizza italiana " + getNombre() + ":  Margarita");
        System.out.println("Añadiendo ingredientes: " + getIngredientes());
        System.out.println("Agregando la salsa " + salsa + " durante la preparación.");
        System.out.println("Colocando en el horno durante " + tiempoEnHorno + " minutos.");
        System.out.println("La pizza italiana está lista para ser servida.");
    }

    public String getNombre() {
        String nombre = null;
        return nombre;
    }


    // Representación en cadena de la pizza italiana
    @Override
    public String toString() {
        return super.toString() + ", Salsa: " + salsa + ", Tiempo en horno: " + tiempoEnHorno + " minutos";
    }
}
