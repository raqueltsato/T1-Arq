/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;

/**
 *
 * @author Hirata
 */
public class Pessoa {
    
    public String nome;
      public ArrayList<String> lista;
    
    public Pessoa(String nome){
        this.nome=nome;
    }

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    
    
    @Override
    public String toString(){
        return nome;
    }
    
    
}
