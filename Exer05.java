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
public class Exer05 {
    
    public static void main(String[] args) {
        System.out.println("Digite as notas");
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("DIgite a Primeira nota: ");
        double nota1 = scan.nextDouble();
        
        System.out.print("DIgite a segunda nota: ");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 7 && media < 10){
            System.out.println("Aprovado");
        }else if(media == 10){
            System.out.println("Média dez, parabéns");
        }else if(media < 7){
            System.out.println("Reprovado");
        }else
            System.out.println("Dados inconclusivos");
    }
    
}
