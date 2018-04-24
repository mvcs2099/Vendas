/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.persistence.*;

/**
 *
 * @author mvcs2
 */
@Entity(name ="funcionarios")
public class Funcionario{
    @Column(name = "nome_funcionario")
    private String nome;
    @Id
    @GeneratedValue
    @Column(name = "cpf_funcionario")
    private String cpf;
    @Column(name = "tel_funcionario")
    private String telefone;
   
    private Endereco endereco;
    
    public Funcionario(String nome, String cpf, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
     
    
    
    
    
}
