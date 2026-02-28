package com.example;

public class Transporte {
    protected double capacidad;
    protected double velocidad;
    protected String combustible;

    public Transporte(double capacidad, double velocidad, String combustible) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.combustible = combustible;
    }

    public void mostrarInfo() {
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Combustible: " + combustible);
    }
}