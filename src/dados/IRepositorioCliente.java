/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import negocio.Cliente;

/**
 *
 * @author mvcs2
 */
public interface IRepositorioCliente {
    public void cadastrar(Cliente cliente);
    public void alterar(Cliente cliente);
    public void remover(String id);
    public Cliente buscar(String id);
    public ArrayList<Cliente> listarTodos();
    
}
