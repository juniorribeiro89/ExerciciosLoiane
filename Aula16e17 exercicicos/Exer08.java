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
public class Exer08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double num;
        double media;
        double soma = 0;
        
        for (double i=0; i<5; i++){
            
            System.out.println("Dgite um Numero");
            num = scan.nextDouble();
            
            soma += num;
        }
        media = soma / 5;
        System.out.println("A Média é: " + media);
    }
    
}
