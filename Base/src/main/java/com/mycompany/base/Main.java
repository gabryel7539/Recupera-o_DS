/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.base;

/**
 *
 * @author Admin
 */

public class Main {
    public static void main(String[] args) {
     
        Circulo circulo = new Circulo(5); 
        Retangulo retangulo = new Retangulo(4, 6); 
        Quadrado quadrado = new Quadrado(4); 

        circulo.exibirNome();
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println();

        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println();

        quadrado.exibirNome();
        System.out.println("Área: " + quadrado.calcularArea());
    }
}