/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.IRepositorioFuncionario;
import dados.RepositorioFuncionarioDB;

/**
 *
 * @author mvcs2
 */
public class CadastroFuncionario {
    private IRepositorioFuncionario repositorioFuncionario;
    public CadastroFuncionario(){
        this.repositorioFuncionario = new RepositorioFuncionarioDB();
    }
}
