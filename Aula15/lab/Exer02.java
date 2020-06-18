/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula15.lab;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer02 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro Numero");
        int num1 = scan.nextInt();
        
        if(num1 >= 0){
            System.out.println("Numero É positivo");
        }else{
            System.out.println("É Negativo");
        }
    }
    
}
