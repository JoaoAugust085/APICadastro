package com.jaugusto.APICadastro.Atribuicoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaugusto.APICadastro.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_atribuicoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AtribuicoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    //Uma atribuição pode ter vários Funcionários
    @OneToMany(mappedBy = "atribuicoes")
    @JsonIgnore
    private List<FuncionarioModel> funcionario;

}
