package com.jaugusto.APICadastro.Funcionarios;


import com.jaugusto.APICadastro.Atribuicoes.AtribuicoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_funcionario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    //Vários Funcionários podem tem uma atribuição
    @ManyToOne
    @JoinColumn(name = "atribuicoes_id")  //Chave estrangeira.
    private AtribuicoesModel atribuicoes;


}
