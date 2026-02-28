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

        setCombustible(getCombustible() - consumo);

        System.out.println("Camión " + getIdTransporte() + " viajó " + distancia + " km.");
        System.out.println("Refrigeración: " + tieneRefrigeracion);
        System.out.println("Combustible restante: " + getCombustible());
    }
}