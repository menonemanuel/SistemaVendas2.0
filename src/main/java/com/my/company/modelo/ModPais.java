/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.modelo;

/**
 *
 * @author emanuel.4966
 */
public class ModPais {
    public class ModCategoria {
    private int id;
    private String nome;
    
    public ModCategoria() {
        this.id =  id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id =id;
    }
    public String getNome() {
        return nome;
    }
    
    public void SetNome (String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
         return "Categoria{" + "id=" + id + ", nome=" + nome + '}';
        }
    }
}
