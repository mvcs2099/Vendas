/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.IRepositorioCliente;
import dados.RepositorioClienteDB;
import java.util.ArrayList;

/**
 *
 * @author mvcs2
 */
public class CadastroCliente {
    private IRepositorioCliente repositorioCliente;
    
    public CadastroCliente(){
        this.repositorioCliente = new RepositorioClienteDB();
    }
    public void cadastrarCliente(Cliente cliente){
        this.repositorioCliente.cadastrar(cliente);
    }
    public void atualizarCliente(Cliente cliente){
        this.repositorioCliente.alterar(cliente);
    }
    public void removerCliente(String id){
        this.repositorioCliente.remover(id);
    }
    public Cliente buscarCliente(String id){
        return this.repositorioCliente.buscar(id);
    }
    public ArrayList<Cliente> listarClientes(){
        return this.repositorioCliente.listarTodos();
    }
    
}
