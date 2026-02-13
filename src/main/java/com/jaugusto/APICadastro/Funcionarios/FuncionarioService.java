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
        Optional<FuncionarioModel> funcionario = funcionarioRepository.findById(id);
        return funcionario.orElse(null);
    }

    //Criar um Funcionario no DB
    public FuncionarioModel criarFuncionario(FuncionarioModel funcionario){
        return funcionarioRepository.save(funcionario);
    }

    //Deletar o cadastro de algum Funcionário
    public void deletarFuncionarioPorId(Long id){
    funcionarioRepository.deleteById(id);

    }

    //Alterar Nome do Funcionário
    public FuncionarioModel alterarFuncionarioPorId(Long id, FuncionarioModel funcionarioAtualizado){
        if(funcionarioRepository.existsById(id)){
            funcionarioAtualizado.setId(id);
            return funcionarioRepository.save(funcionarioAtualizado);
        }
        return null;
    }


}
