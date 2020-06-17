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
public class Exer11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o Primeiro Numero: ");
        int num1 = scan.nextInt();
        
        System.out.print("Entre com o Segundo Numero: ");
        int num2 = scan.nextInt();
        
        int soma = 0;
        for (int i=num1; i<=num2; i++){
            soma += i;
            System.out.println(i);
            System.out.println(soma);
        }
        System.out.println("Soma: " + soma);
        
    }
    
}
