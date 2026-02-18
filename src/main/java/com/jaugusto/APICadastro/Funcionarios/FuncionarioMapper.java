package com.jaugusto.APICadastro.Funcionarios;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioMapper {


    public FuncionarioModel toModel(FuncionarioDTO funcionarioDTO){
        FuncionarioModel funcionarioModel = new FuncionarioModel();
        funcionarioModel.setId(funcionarioDTO.getId());
        funcionarioModel.setNome(funcionarioDTO.getNome());
        funcionarioModel.setEmail(funcionarioDTO.getEmail());
        funcionarioModel.setIdade(funcionarioDTO.getIdade());
        funcionarioModel.setAtribuicoes(funcionarioDTO.getAtribuicoes());
        return funcionarioModel;
    }

    public FuncionarioDTO toDTO(FuncionarioModel funcionarioModel){
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setId(funcionarioModel.getId());
        funcionarioDTO.setNome(funcionarioModel.getNome());
        funcionarioDTO.setEmail(funcionarioModel.getEmail());
        funcionarioDTO.setIdade(funcionarioModel.getIdade());
        funcionarioDTO.setAtribuicoes(funcionarioModel.getAtribuicoes());

        return funcionarioDTO;
    }



}
