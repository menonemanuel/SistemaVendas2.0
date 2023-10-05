/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_vendas;

import com.mycompany.ferramentas.BancoDeDadosMySql;

/**
 *
 * @author emanuel.4966
 */
public class Sistema_Vendas {

    public static void main(String[] args) {
        BancoDeDadosMySql.conectar();
        
//        //Teste listagem
//        DaoCategoria categoria = new DaoCategoria();
//        
//        for(int i = 0; i < categoria.listar().size(); i++){
//            System.out.println(categoria.listar().get(i).getId());
//            System.out.println(categoria.listar().get(i).getNome());
//        }
    }
}
