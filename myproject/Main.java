package com.myproject;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear ingredientes para la pizza
        String[] ingredientesPizza = {"queso", "tomate", "cebolla"};

        System.out.println("¿Escriba que tipo de pizza desea?");
        System.out.println("1. Pizza Clásica");
        System.out.println("2. Pizza Italiana");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Crear una instancia de la clase Pizza
                Pizza pizza = new Pizza("Pizza Clásica", 58.99, Arrays.asList(ingredientesPizza));
                System.out.println("Ha elegido una Pizza Clásica.");
                System.out.println("Detalles de la pizza:");
                System.out.println(pizza);
                System.out.println("Ingredientes: " + pizza.getIngredientes());
                System.out.println("Preparando la pizza:");
                pizza.preparar();
                break;
            case 2:
                // Crear una instancia de la clase PizzaItaliana
                String[] ingredientesPizzaItaliana = {"queso", "tomate", "cebolla", "albahaca"};
                PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", 89.99, Arrays.asList(ingredientesPizzaItaliana), "tomate", 15);
                System.out.println("Ha elegido una Pizza Italiana.");
                System.out.println("Detalles de la pizza italiana:");
                System.out.println(pizzaItaliana);
                System.out.println("Ingredientes: " + pizzaItaliana.getIngredientes());
                System.out.println("Preparando la pizza italiana:");
                pizzaItaliana.preparar();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
