/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getConexao;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getStatement;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;

/**
 *
 * @author emanuel.4966
 */
public class DaoPais extends BancoDeDadosMySql{
    
     private String sql;
    
    public Boolean inserir(int id, String nome){
        try{
            sql = "INSERT INTO CATEGORIA (ID, NOME) VALUES (?, ?, ?)";
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);
            
            getStatement().executeUpdate();
            
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean alterar(int id, String novoNome){
        try{
            sql = "UPDATE CATEGORIA SET NOME = ?, WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(3, id);
            getStatement().setString(1, novoNome);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM CATEGORIA WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public ResultSet listarTodos(){
        try{
            sql = "SELECT ID, NOME FROM CATEGORIA";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = "SELECT ID, NOME FROM CATEGORIA WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
     public ResultSet listarPorNome(String nome){
        try{
            sql = "SELECT ID, NOME, FROM CATEGORIA WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
}
