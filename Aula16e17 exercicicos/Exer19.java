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
public class Exer19 {
     public static void main(String[] args) {
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Entre com as Notas");
         int notas = scan.nextInt();
         
         double soma = 0;
         double media;
         double nota;
         
         for (int i=0; i<notas; i++){
             System.out.println("Entre com a nota " + (i+1));
                nota = scan.nextDouble();             
                soma += nota;
         }
         
         media = soma / notas;
         
         System.out.println("Soma " + soma);
         System.out.println("Média " + media);
     
     
    }
}