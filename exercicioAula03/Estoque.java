/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioAula03;
import java.util.ArrayList;
/**
 *
 * @author AMANDAROTHMANNPIOVESANA
 */
public class Estoque {
    ArrayList<Produto> mercado = new ArrayList<>();
    
    public Produto addProduto(String nome, int quantidade) {
        for (Produto prod : mercado) {
            if (nome.equals(prod.nome)) {
                prod.quantidade += quantidade;
            }
        }
        mercado.add(new Produto(nome,quantidade));
        return null;
    }
    public Produto remProduto(String nome, int quantidade) {
        for (Produto prod : mercado) {
            if (nome == prod.nome) {
                prod.quantidade -= quantidade;
                if (prod.quantidade == 0) {
                    mercado.remove(prod);
                }
            }
        }
        return null;
    }

    public int consQntd(String nome) {
        for(Produto prod : mercado) {
            if(nome == prod.nome) {
                return prod.quantidade;
            }
        }
        return 0;
    }
    public String prodMoreEst() {
        int maior = 0;
        String nomeMaiorProduto = "";
        
        for (Produto prod : mercado) {
            if (prod.quantidade > maior) {
                maior = prod.quantidade;
                nomeMaiorProduto = prod.nome;
            }
        }
        
        System.out.println("Produto de maior quantidade: " + nomeMaiorProduto + "\n|| Quantidade: " + maior);
       return nomeMaiorProduto;
    }

    public Produto limparEst() {
        for (Produto prod : mercado) {
            prod.quantidade = 0;
            prod.nome ="";
        }
        return null;
    }
    
    public Produto reabastecerEstoque(int quantidade) {
        int maisQuantidade = quantidade;
        for (Produto prod : mercado) {
            prod.quantidade += maisQuantidade;
        }
        return null;
    }
    
    public String listarProdutos() {
        String conct = " ";
        for (Produto prod : mercado) {
            conct += prod.nome + " ";
        }
        return conct;
    }
}