/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula16e17;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite Login e sua senha");
        boolean inforValidas = false; //flag
        String login;
        String senha;
        
        do{
            System.out.print("Usuario: ");
            login = scan.next();
            
            System.out.print("Senha: ");
            senha = scan.next();
            
            if (login.equalsIgnoreCase(senha)){
                //inforValidas = false;
                System.out.println("Invalido, Digite novamente: ");   
            }else{
                inforValidas = true;
                System.out.println("Validado, OK !!!");
            }

        }while(!inforValidas);
    }
}
