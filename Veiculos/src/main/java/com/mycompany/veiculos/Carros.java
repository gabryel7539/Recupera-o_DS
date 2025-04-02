/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author Admin
 */
public class Carros extends Veiculos {
    private int numeroPortas;

    
    public Carros(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);
        this.numeroPortas = numeroPortas;
    }

    
    public void exibirInformacoesCarro() {
        super.exibirInformacoes(); 
        System.out.println("Número de Portas: " + numeroPortas);
    }

    
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}