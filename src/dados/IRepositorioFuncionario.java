/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import negocio.Funcionario;


/**
 *
 * @author mvcs2
 */
public interface IRepositorioFuncionario {
    public void cadastrar(Funcionario funcionario);
    public void alterar(Funcionario funcionario);
    public void remover(String id);
    public Funcionario buscar(String id);
    public ArrayList<Funcionario> listarTodos();
}
