package co.edu.umanizales.electrodomestics_exercises.controller;

import co.edu.umanizales.electrodomestics_exercises.model.Lavadora;
import co.edu.umanizales.electrodomestics_exercises.model.Refrigerador;
import co.edu.umanizales.electrodomestics_exercises.model.Horno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectrodomesticsController {

    @GetMapping("/lavadora")
    public String getLavadora() {
        Lavadora lavadora = new Lavadora("LG", "T800", "A++", 8);
        return lavadora.obtenerDetalles();
    }

    @GetMapping("/refrigerador")
    public String getRefrigerador() {
        Refrigerador refrigerador = new Refrigerador("Samsung", "RF260", "A+", "No Frost");
        return refrigerador.obtenerDetalles();
    }

    @GetMapping("/horno")
    public String getHorno() {
        Horno horno = new Horno("Whirlpool", "WH45", "A", 40);
        return horno.obtenerDetalles();
    }
}
