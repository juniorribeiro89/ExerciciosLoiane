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
public class Exer17 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        System.out.println(num + " != ");
        
        int fatorial = 1;
        for (int i=num; i>0; i--){
            fatorial *= i;
            System.out.println(num + " * " + i + " = " + fatorial);
        }
        
        System.out.println("Resultado " + fatorial);
    }
    
}
