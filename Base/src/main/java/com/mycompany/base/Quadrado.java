/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.base;

/**
 *
 * @author Admin
 */

class Quadrado extends Retangulo {

   
    public Quadrado(double lado) {
        super(lado, lado);
    }

    
   @Override
    public double calcularArea() {
        double lado = getLargura();
        return lado * lado; 
    }
}