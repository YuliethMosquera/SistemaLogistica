package com.example;

public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {
        double consumo = distancia * 0.5;
        if (tieneRefrigeracion) {
            consumo *= 2;
        }
        System.out.println("El camión " + getIdTransporte() + " viajó " + distancia + " km.");
        System.out.println("Consumo de combustible: " + consumo);
    }
}