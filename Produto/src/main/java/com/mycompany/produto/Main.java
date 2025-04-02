/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produto;

/**
 *
 * @author Admin
 */
// Classe principal para testar o sistema
public class Main {
    public static void main(String[] args) {
        // Instanciando um produto normal
        Produto produto1 = new Produto("Produto A", 100.0);
        produto1.exibirDetalhes();  // Exibe os detalhes do produto

        System.out.println();  // Adiciona uma linha em branco para separar

        // Instanciando um produto com desconto
        ProdutoComDesc produto2 = new ProdutoComDesc("Produto B", 150.0, 20.0);
        produto2.exibirDetalhesComDesconto();  // Exibe os detalhes do produto com desconto
    }
}
