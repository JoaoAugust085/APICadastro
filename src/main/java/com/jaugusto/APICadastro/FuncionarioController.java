package com.jaugusto.APICadastro;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FuncionarioController {


    @GetMapping("/welcome")
    public String boasVindas(){
        return "Boas vindas a API de cadastro de Funcionários";
    }

}
