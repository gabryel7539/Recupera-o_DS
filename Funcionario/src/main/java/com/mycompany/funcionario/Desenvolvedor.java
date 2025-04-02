/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario;

/**
 *
 * @author Admin
 */
class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;

  
    public Desenvolvedor(String nome, int idade, double salario, String linguagemProgramacao) {
        super(nome, idade, salario); // Chama o construtor da classe Funcionario
        this.linguagemProgramacao = linguagemProgramacao;
    }

  
    public void exibirInformacoesDesenvolvedor() {
        super.exibirInformacoes(); // Chama o método exibirInformacoes() da classe Funcionario
        System.out.println("Linguagem de Programação: " + linguagemProgramacao);
    }

    
    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }
}