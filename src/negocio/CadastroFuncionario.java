/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.IRepositorioFuncionario;
import dados.RepositorioFuncionarioDB;
import java.util.ArrayList;

/**
 *
 * @author mvcs2
 */
public class CadastroFuncionario {
    private IRepositorioFuncionario repositorioFuncionario;
    public CadastroFuncionario(){
        this.repositorioFuncionario = new RepositorioFuncionarioDB();
    }
    public void cadastrarFuncionario(Funcionario func){
        repositorioFuncionario.cadastrar(func);
    }
    public void removerFuncionario(String id){
        repositorioFuncionario.remover(id);
    }
    public void alterarFuncionario(Funcionario funcionario){
        repositorioFuncionario.alterar(funcionario);
    }
    public ArrayList<Funcionario> listarTodos(){
        return repositorioFuncionario.listarTodos();
    }
    public Funcionario buscarFuncionario(String id){
        return repositorioFuncionario.buscar(id);
    }
    
}
