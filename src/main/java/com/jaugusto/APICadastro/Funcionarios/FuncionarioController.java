package com.jaugusto.APICadastro.Funcionarios;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/welcome")
    public String boasVindas(){
        return "Boas vindas a API de cadastro de Funcionários";
    }

    // Adicionar Funcionário (CREATE)
    @PostMapping("/criar")
    public FuncionarioDTO criarFuncionario(@RequestBody FuncionarioDTO funcionario){
        return funcionarioService.criarFuncionario(funcionario);
    }

    // Mostrar todos os Funcionários (READ)

    @GetMapping("/listar")
    public List<FuncionarioModel> listarFuncionarios(){
        return funcionarioService.listarFuncionarios();
    }

    // Mostrar Funcionário por ID (READ)
    @GetMapping("/listar/{id}")
    public FuncionarioModel listarFuncionarioPorId(@PathVariable Long id){
        return funcionarioService.pesquisarFuncionarioPorId(id);
    }


    // Alterar dados dos Funcionários (UPDATE)
    @PutMapping("/alterar/{id}")
    public FuncionarioModel alterarFuncionarioPorId(@PathVariable Long id, @RequestBody FuncionarioModel funcionarioAtualizado){
        return funcionarioService.alterarFuncionarioPorId(id, funcionarioAtualizado);
    }



    // Deletar Funcionario (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarFuncionarioPorId(@PathVariable Long id){
        funcionarioService.deletarFuncionarioPorId(id);
    }

}
