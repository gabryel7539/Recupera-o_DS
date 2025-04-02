/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario;

/**
 *
 * @author Admin
 */

public class Main {
    public static void main(String[] args) {
       
        Gerente gerente1 = new Gerente("Carlos Silva", 45, 8000.0, "Financeiro");
        System.out.println("Informações do Gerente:");
        gerente1.exibirInformacoesGerente();
        System.out.println(); 

      
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Ana Costa", 30, 5000.0, "Java");
        System.out.println("Informações do Desenvolvedor:");
        desenvolvedor1.exibirInformacoesDesenvolvedor(); 
    }
}