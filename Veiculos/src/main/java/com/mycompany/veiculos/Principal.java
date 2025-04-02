/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author Admin
 */
public class Principal {
    public static void main (String [] args){
        
        
             Carros carro1 = new Carros("Fusca", "ABC-1234", 1980, 4);
             System.out.println("Informações do Carro:");
             carro1.exibirInformacoesCarro();  
             System.out.println();  


             Motos moto1 = new Motos("CB 500", "XYZ-5678", 2020, 500);
             System.out.println("Informações da Moto:");
             moto1.exibirInformacoesMoto();  
        
        
        
    }
    
}
