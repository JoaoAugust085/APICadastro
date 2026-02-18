package com.jaugusto.APICadastro.Funcionarios;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;
    private FuncionarioMapper funcionarioMapper;


    public FuncionarioService(FuncionarioRepository funcionarioRepository, FuncionarioMapper funcionarioMapper) {
        this.funcionarioRepository = funcionarioRepository;
        this.funcionarioMapper = funcionarioMapper;
    }

    //Listar todos os meus Funcionarios
    public List<FuncionarioDTO> listarFuncionarios(){
        List<FuncionarioModel> funcionarios = funcionarioRepository.findAll();
        return funcionarios.stream()
                .map(funcionarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    //Listar Funcionario por ID
    public FuncionarioDTO pesquisarFuncionarioPorId(Long id){
        Optional<FuncionarioModel> funcionario = funcionarioRepository.findById(id);
        return funcionario.map(funcionarioMapper::toDTO).orElse(null);
    }

    //Criar um Funcionario no DB
    public FuncionarioDTO criarFuncionario(FuncionarioDTO funcionarioDTO){
        FuncionarioModel funcionario = funcionarioMapper.toModel(funcionarioDTO);
        funcionario = funcionarioRepository.save(funcionario);
        return funcionarioMapper.toDTO(funcionario);
    }

    //Deletar o cadastro de algum Funcionário
    public void deletarFuncionarioPorId(Long id){
    funcionarioRepository.deleteById(id);

    }

    //Alterar Nome do Funcionário
    public FuncionarioDTO alterarFuncionarioPorId(Long id, FuncionarioDTO funcionarioAtualizado){
        if(funcionarioRepository.existsById(id)){
            FuncionarioModel funcionario = funcionarioMapper.toModel(funcionarioAtualizado);
            funcionario.setId(id);
            return funcionarioMapper.toDTO(funcionarioRepository.save(funcionario));
        }
        return null;
    }


}
