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
public class Produto {
    private String id;
    private String nome;
    private double valor;
    private String marca;
    private String desc;

    public Produto(String id, String nome, double valor, String marca, String desc) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    
}
