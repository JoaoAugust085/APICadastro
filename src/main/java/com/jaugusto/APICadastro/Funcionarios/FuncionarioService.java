package com.jaugusto.APICadastro.Funcionarios;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;


    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    //Listar todos os meus ninjas
    public List<FuncionarioModel> listarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    //Listar Funcionario por ID
    public FuncionarioModel pesquisarFuncionarioPorId(Long id){
        Optional<FuncionarioModel> funcionarioPorId = funcionarioRepository.findById(id);
        return funcionarioPorId.orElse(null);
    }

    //Criar um Funcionario no DB
    public FuncionarioModel criarFuncionario(FuncionarioModel funcionario){
        return funcionarioRepository.save(funcionario);
    }


}
