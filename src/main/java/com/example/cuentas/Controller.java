package com.example.cuentas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping( "/api")
    public String apiCuentas(){
        return "API-REST del Sistema de Manejo de Cuentas esta iniciado correctamente";
    }
}
