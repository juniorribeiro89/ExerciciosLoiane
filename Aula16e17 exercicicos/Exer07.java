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
public class Exer07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        int maior = Integer.MIN_VALUE;
        
        for (int i=0; i<5; i++){

            System.out.println("Digite um Numero: ");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
            }
           }
       
    System.out.println("Maior Numero é: " + maior);
   }
    
}
