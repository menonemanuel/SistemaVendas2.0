/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.modelo;

/**
 *
 * @author emanuel.4966
 */
public class ModEstado {
    private int id;
    private int idPais;
    private String nome;
    
    public ModEstado(int id,  int idPais, String nome) {
        this.id =  id;
        this.idPais = idPais;
        this.nome = nome;
    }

    public ModEstado() {
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id =id;
    }
    
    public int getIdPais() {
        return idPais;
    }
    
    public void setIdPais(int idPais) {
        this.idPais = idPais;
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
