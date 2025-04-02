/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veiculos;

/**
 *
 * @author Admin
 */
public class Veiculos {
     private String modelo;
     private String placa;
     private int ano;
 
     
     public Veiculos(String modelo, String placa, int ano) {
         this.modelo = modelo;
         this.placa = placa;
         this.ano = ano;
     }
 

 

     
     public void exibirInformacoes() {
         System.out.println("Modelo: " + modelo);
         System.out.println("Placa: " + placa);
         System.out.println("Ano: " + ano);
     }
 
     
     public String getModelo() {
         return modelo;
     }
 
     public void setModelo(String modelo) {
         this.modelo = modelo;
     }
 
     public String getPlaca() {
         return placa;
     }
 
     public void setPlaca(String placa) {
         this.placa = placa;
     }
 
     public int getAno() {
         return ano;
     }
 
     public void setAno(int ano) {
         this.ano = ano;
     }
 }