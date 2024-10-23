package co.edu.umanizales.electrodomestics_exercises.model;

public class Electrodomestico {
    private String marca;
    private String modelo;
    private String consumoEnergetico;

    public Electrodomestico(String marca, String modelo, String consumoEnergetico) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoEnergetico = consumoEnergetico;
    }

    public String obtenerDetalles() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Consumo Energético: " + consumoEnergetico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
}
