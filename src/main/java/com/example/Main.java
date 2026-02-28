package com.example;

public class Main {
    public static void main(String[] args) {

        BuqueCarga buque = new BuqueCarga(50000, 30, "Diésel", 200);
        CamionDeReparto camion = new CamionDeReparto(5000, 80, "Gasolina", "Alimentos");

        System.out.println("=== Buque de Carga ===");
        buque.mostrarInfo();

        System.out.println("\n=== Camión de Reparto ===");
        camion.mostrarInfo();
    }
}