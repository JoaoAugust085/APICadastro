package com.jaugusto.APICadastro.Funcionarios;


import com.jaugusto.APICadastro.Atribuicoes.AtribuicoesModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_funcionario")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //Vários Funcionários podem tem uma atribuição
    @ManyToOne
    @JoinColumn(name = "atribuicoes_id")  //Chave estrangeira.
    private AtribuicoesModel atribuicoes;

    public FuncionarioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public FuncionarioModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
