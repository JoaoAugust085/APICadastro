package com.jaugusto.APICadastro.Funcionarios;

import com.jaugusto.APICadastro.Atribuicoes.AtribuicoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioDTO {

    private Long id;

    private String nome;

    private String email;

    private int idade;

    private AtribuicoesModel atribuicoes;



}
