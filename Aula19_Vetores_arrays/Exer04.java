/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula19_Vetores_arrays;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer04 {
    public static void main(String[] args) {
        
        //Entrada
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        double[] vetorB = new double[vetorA.length];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.print("Digite os Números: " + i + " ");
            vetorA[i] = scan.nextInt();
            
            vetorB[i] = sqrt(vetorA[i]);
        }
        System.out.print("Os numeros do vetor A são: ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");
        
        System.out.println("O numeros do vetor B ");
        for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        
        }
        
        
    }
}

//Scanner scan = new Scanner(System.in);
//        
//        //Array
//        int[] vetorA = new int[5];
//        double[] vetorB = new double[vetorA.length];
//        
//        //Interações e entradas
//        for (int i=0; i<vetorA.length; i++){
//            System.out.print("Entre com os Números: " +i+ " ");
//            vetorA[i] = scan.nextInt();
//            
//            //vetorB[i] = (int) sqrt(vetorA[i]);
//            vetorB[i] = Math.sqrt(vetorA[i]);
//        }
//        
//        //Saidas
//        System.out.print("Lista dos numeros digitados: ");
//        for (int i=0; i<vetorA.length; i++){
//            System.out.print(vetorA[i] + " ");
//        }
//        System.out.println(" ");
//        
//        System.out.print("Lista dos numeros digitados: ");
//        for (int i=0; i<vetorB.length; i++){
//            System.out.print(vetorB[i] + " ");
//        }