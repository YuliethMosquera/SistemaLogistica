package com.example;

public class Main {
    public static void main(String[] args) {

        BuqueCarga buque = new BuqueCarga("B001", 10000, 50000, 50);
        CamionDeReparto camion = new CamionDeReparto("C001", 500, 5000, true);

        buque.mostrarDatos();
        buque.atracarEnPuerto();

        camion.viajar(100);
    }
}