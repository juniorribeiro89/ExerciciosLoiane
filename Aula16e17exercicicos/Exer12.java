/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula16e17exercicicos;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */

//Criando uma Tabuada;
public class Exer12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o Numero: ");
        int num = scan.nextInt();
        
        System.out.println("Tabuada de " + num + ":");
        for (int i=0; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
            
        }
    
    }
}
