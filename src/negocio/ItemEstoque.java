/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author mvcs2
 */
public class ItemEstoque {
    private String id;
    private Produto produtoEstoque;
    private int quantidade;
    private Fornecedor fornecedor;

    public ItemEstoque(String id, Produto produtoEstoque, int quantidade, Fornecedor fornecedor) {
        this.id = id;
        this.produtoEstoque = produtoEstoque;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }
    
    

    
    
}
