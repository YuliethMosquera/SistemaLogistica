package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CamionDeReparto camion = new CamionDeReparto("C001", 500, 5000, true);
        BuqueCarga buque = new BuqueCarga("B001", 10000, 50000, 50);

        buque.mostrarDatos();
        buque.atracarEnPuerto();

        camion.setCombustible(-20);
        System.out.println("Combustible tras prueba de fuego: " + camion.getCombustible());

        ArrayList<Transporte> transportes = new ArrayList<>();
        transportes.add(camion);
        transportes.add(buque);

        for (Transporte t : transportes) {
            t.viajar(100);
        }
    }
}