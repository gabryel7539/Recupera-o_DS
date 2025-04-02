/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.base;

/**
 *
 * @author Admin
 */

class Circulo extends Base {
    private double raio;

    public Circulo(double raio) {
        super("Círculo"); 
        this.raio = raio;
    }

    
    public double calcularArea() {
        return Math.PI * raio * raio; 
    }

    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
