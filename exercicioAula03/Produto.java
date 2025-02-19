/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioAula03;

/**
 *
 * @author AMANDAROTHMANNPIOVESANA
 */
public class Produto {
    String nome;
    int quantidade;
    
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void addQuantidade(int adicao) {
        this.quantidade += adicao;
    }
    
    public void remQuantidade(int subt) {
        this.quantidade -= subt;
    }
}
