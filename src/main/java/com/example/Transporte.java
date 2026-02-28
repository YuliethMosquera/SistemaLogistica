package com.example;

public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }

    public void viajar(int distancia) {
        double consumo = distancia * 0.5;
        combustible -= consumo;
        System.out.println("El transporte " + idTransporte + " viajó " + distancia + " km.");
        System.out.println("Combustible restante: " + combustible);
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}