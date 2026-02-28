package com.example;

public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible);
        setCapacidadCarga(capacidadCarga);
    }

    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else {
            this.combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            this.capacidadCarga = 0;
        } else {
            this.capacidadCarga = carga;
        }
    }

    public double getCombustible() {
        return combustible;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void viajar(int distancia) {
        double consumo = distancia * 0.5;
        combustible -= consumo;
        if (combustible < 0) combustible = 0;

        System.out.println(idTransporte + " viajó " + distancia + " km.");
        System.out.println("Combustible restante: " + combustible);
    }
}