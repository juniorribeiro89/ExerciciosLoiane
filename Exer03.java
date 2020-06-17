/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o Genero: ");
        
        String letra = scan.next();
        
        // foma errada !
        /*if (letra == "F" || letra == "f"){
            System.out.println("É Feminino");
        }else if(letra == "M" || letra == "m"){
            System.out.println("É masculinmo");
        }else 
            System.out.println("Letra invalida");*/
        
        if (letra.equalsIgnoreCase("f")){
            System.out.println("Genero Feminino");
        }else if(letra.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        }else
            System.out.println("Letra Invalida");
            
    }
    
}
