/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author mvcs2
 */
public interface IFachada {
    //cadastro de funcionario
    public void cadastrarFuncionario(String nome, String cpf, String telefone, String email, Endereco endereco, Calendar dataNasc);
    public void removerFuncionario(String id);
    //atualização de cadastro de funcionario
    public void alterarFuncionario(String id);
    public Funcionario buscarFuncionario(String id);
    public ArrayList<Funcionario> listarFuncionarios();
    //cadastro de Cliente
    
}
