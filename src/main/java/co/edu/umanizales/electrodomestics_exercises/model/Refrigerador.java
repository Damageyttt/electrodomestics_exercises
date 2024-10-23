package co.edu.umanizales.electrodomestics_exercises.model;

public class Refrigerador extends Electrodomestico {
    private String tipo; // Tipo de refrigerador (ej. "No Frost", "Doble puerta")

    public Refrigerador(String marca, String modelo, String consumoEnergetico, String tipo) {
        super(marca, modelo, consumoEnergetico);
        this.tipo = tipo;
    }
 
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tipo: " + tipo;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
