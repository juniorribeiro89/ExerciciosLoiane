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
public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o Primeiro Numero: ");
        double num1 = scan.nextDouble();
        
        System.out.print("Digite o Segundo Numero: ");
        double num2 = scan.nextDouble();
        
        System.out.print("Digite o Terceiro Numero: ");
        double num3 = scan.nextDouble();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("Primeiro numero é maior");
        }else if (num2 > num1 && num2> num3){
            System.out.println("Segundo Numero é maior");
        }else if(num1 == num2 && num1 == num3){
            System.out.println(" Numeros Iguais");
        }else
            System.out.println("Terceiro Numero é maior");
    }
    
}
