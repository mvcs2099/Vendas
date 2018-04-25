/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Calendar;
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
    private String email;
    private Endereco endereco;
    private Calendar dataNasc;

    public Funcionario(String nome, String cpf, String telefone, String email, Endereco endereco, Calendar dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
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
