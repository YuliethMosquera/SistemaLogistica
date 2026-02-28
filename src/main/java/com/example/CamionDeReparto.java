package com.example;

public class CamionDeReparto extends Transporte {
    private String tipoCarga;

    public CamionDeReparto(double capacidad, double velocidad, String combustible, String tipoCarga) {
        super(capacidad, velocidad, combustible);
        this.tipoCarga = tipoCarga;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de carga: " + tipoCarga);
    }
}