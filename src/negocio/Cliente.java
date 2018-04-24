/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.persistence.Entity;

/**
 *
 * @author mvcs2
 */
@Entity(name = "clientes")
public class Cliente extends PessoaFisica{
    
    public Cliente(String nome, String cpf, String telefone, Endereco endereco) {
        super(nome, cpf, telefone, endereco);
    }
    
    
    
}
