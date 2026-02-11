package com.jaugusto.APICadastro.Funcionarios;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FuncionarioController {


    @GetMapping("/welcome")
    public String boasVindas(){
        return "Boas vindas a API de cadastro de Funcionários";
    }

    // Adicionar Funcionário (CREATE)
    @PostMapping("/criar")
    public String criarFuncionario(){
        return "Funcionario Criado com sucesso";
    }

    // Mostrar todos os Funcionários (READ)

    @GetMapping("/todos")
    public String mostrarTodosOsFuncionarios(){
        return "Todos os Funcionarios";
    }

    // Mostrar Funcionário por ID (READ)
    @GetMapping("/porID")
    public String mostrarFuncionarioPorId(){
        return "Funcionario do ID";
    }


    // Alterar dados dos Funcionários (UPDATE)
    @PutMapping("/alterarID")
    public String alterarFuncionarioPorId(){
        return "Ninja Alterado";
    }

    // Deletar Funcionario (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarFuncionarioPorId(){
        return "Funcionario deletado por ID";
    }

}
