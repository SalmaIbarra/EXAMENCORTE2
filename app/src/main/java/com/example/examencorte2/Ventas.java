package com.example.examencorte2;

public class Ventas {
    private int idVenta;
    private int numBomba;
    private int tipoGasolina;
    private float precioGasolina;
    private int cantidadGasolina;

    // Constructor
    public Ventas(int idVenta, int numBomba, int tipoGasolina, float precioGasolina, int cantidadGasolina) {
        this.idVenta = idVenta;
        this.numBomba = numBomba;
        this.tipoGasolina = tipoGasolina;
        this.precioGasolina = precioGasolina;
        this.cantidadGasolina = cantidadGasolina;
    }

    // Métodos getter y setter para cada atributo

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getNumBomba() {
        return numBomba;
    }

    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    public int getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public float getPrecioGasolina() {
        return precioGasolina;
    }

    public void setPrecioGasolina(float precioGasolina) {
        this.precioGasolina = precioGasolina;
    }

    public int getCantidadGasolina() {
        return cantidadGasolina;
    }

    public void setCantidadGasolina(int cantidadGasolina) {
        this.cantidadGasolina = cantidadGasolina;
    }
}

