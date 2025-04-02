/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.base;

/**
 *
 * @author Admin
 */
class Base {
    
    private String nome;

   
    public Base(String nome) {
        this.nome = nome;
    }

   
    public void exibirNome() {
        System.out.println("Forma: " + this.nome);  
    }

   
    public String getNome() {
        return nome; 
    }

    
    public void setNome(String nome) {
        this.nome = nome;  
    }
}
