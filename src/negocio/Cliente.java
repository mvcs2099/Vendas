/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mvcs2
 */
@Entity(name = "clientes")
public class Cliente{
    private String nome;
    @Id
    private String cpf;
    private String telefone;
    private Endereco endereco;
    private Calendar dataNascimento;

    public Cliente(String nome, String cpf, String telefone, Endereco endereco, Calendar dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    
    
    
    
    
}
