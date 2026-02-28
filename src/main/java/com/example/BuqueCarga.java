package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque " + getIdTransporte() + " está listo para descarga.");
    }

    public void mostrarDatos() {
        double costoViaje = cantidadContenedores * 100;
        System.out.println("Buque ID: " + getIdTransporte());
        System.out.println("Contenedores: " + cantidadContenedores);
        System.out.println("Costo de Viaje: USD " + costoViaje);
    }
}