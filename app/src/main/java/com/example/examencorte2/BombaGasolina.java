package com.example.examencorte2;

public class BombaGasolina {
    private int id;
    private int numBomba;
    private int capacidadBomba;
    private int tipoGasolina;
    private float precioGasolina;
    private int acumuladorLitrosBomba;

    // Constructor
    public BombaGasolina(int id, int numBomba, int capacidadBomba, int tipoGasolina, float precioGasolina) {
        this.id = id;
        this.numBomba = numBomba;
        this.capacidadBomba = capacidadBomba;
        this.tipoGasolina = tipoGasolina;
        this.precioGasolina = precioGasolina;
        this.acumuladorLitrosBomba = 0;
    }

    // Método para obtener el inventario de la bomba (litros disponibles)
    public int inventario() {
        return capacidadBomba - acumuladorLitrosBomba;
    }

    // Método para realizar una venta de gasolina
    public float hacerVenta(int cantidad) {
        if (cantidad <= 0) {
            return 0.0f; // Venta inválida, cantidad no puede ser negativa o cero
        }

        if (cantidad > inventario()) {
            return 0.0f; // No hay suficiente gasolina en la bomba para la venta
        }

        float totalVenta = cantidad * precioGasolina;
        acumuladorLitrosBomba += cantidad;
        return totalVenta;
    }

    // Métodos getter y setter para cada atributo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumBomba() {
        return numBomba;
    }

    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    public int getCapacidadBomba() {
        return capacidadBomba;
    }

    public void setCapacidadBomba(int capacidadBomba) {
        this.capacidadBomba = capacidadBomba;
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

    public int getAcumuladorLitrosBomba() {
        return acumuladorLitrosBomba;
    }

    public void setAcumuladorLitrosBomba(int acumuladorLitrosBomba) {
        this.acumuladorLitrosBomba = acumuladorLitrosBomba;
    }
}


