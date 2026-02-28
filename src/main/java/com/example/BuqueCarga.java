package com.example;

public class BuqueCarga extends Transporte {
    private int numeroContenedores;

    public BuqueCarga(double capacidad, double velocidad, String combustible, int numeroContenedores) {
        super(capacidad, velocidad, combustible);
        this.numeroContenedores = numeroContenedores;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Contenedores: " + numeroContenedores);
    }
}