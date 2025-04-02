/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author Admin
 */
public class Motos extends Veiculos {
     private int cilindrada;
 
    
     public Motos(String modelo, String placa, int ano, int cilindrada) {
         super(modelo, placa, ano);
         this.cilindrada = cilindrada;
     }
 
    
     public void exibirInformacoesMoto() {
         super.exibirInformacoes(); 
         System.out.println("Cilindrada: " + cilindrada + "cc");
     }
 
    
     public int getCilindrada() {
         return cilindrada;
     }
 
     public void setCilindrada(int cilindrada) {
         this.cilindrada = cilindrada;
     }
 }
