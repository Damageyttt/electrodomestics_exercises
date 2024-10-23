package co.edu.umanizales.electrodomestics_exercises.model;

public class Lavadora extends Electrodomestico {
    private int capacidad; // Capacidad en kg

    public Lavadora(String marca, String modelo, String consumoEnergetico, int capacidad) {
        super(marca, modelo, consumoEnergetico);
        this.capacidad = capacidad;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Capacidad: " + capacidad + " kg";
    }

    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

    

