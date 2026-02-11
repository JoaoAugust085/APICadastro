package com.jaugusto.APICadastro.Atribuicoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("atribuicoes")
public class AtribuicoesController {

    @GetMapping("listar")
    public String listarAtribuicoes(){
        return "Essas são as atribuições";
    }


    @PostMapping("/criar")
    public String criarAtribuicoes(){
        return "Atribuição criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarAtribuicoes(){
        return "Atribuição alterada com sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarAtribuicao(){
        return "Atribuição DELETADA";
    }




}
