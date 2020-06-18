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
public class Exer10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o Primeiro Numero: ");
        int num1 = scan.nextInt();
        
        System.out.print("Entre com o Segundo Numero: ");
        int num2 = scan.nextInt();
        
        for (int i=num1; i<=num2; i++){
           
            System.out.println(i);
            
        }
    }
    
}
