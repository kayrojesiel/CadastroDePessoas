package com.kjdev.CadrastroDePessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PessoaController {

    @GetMapping
    public String boasVindas(){
        return "Boas Vindas";
    }
}
