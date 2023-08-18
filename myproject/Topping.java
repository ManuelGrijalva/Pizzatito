package com.myproject;


import com.myproject.Pizza;

// Clase para representar un topping de pizza
    public class Topping {
        private String nombre;

        // Constructor de la clase Topping
        public Topping(String nombre) {
            this.nombre = nombre;
        }

        // Método para agregar el topping a una pizza
        public void agregar(Pizza pizza) {
            pizza.getIngredientes().add(nombre);
        }
    }


