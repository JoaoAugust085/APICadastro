package com.jaugusto.APICadastro.Atribuicoes;

import com.jaugusto.APICadastro.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_atribuicoes")
public class AtribuicoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    //Uma atribuição pode ter vários Funcionários
    @OneToMany(mappedBy = "atribuicoes")
    private List<FuncionarioModel> funcionario;








}
