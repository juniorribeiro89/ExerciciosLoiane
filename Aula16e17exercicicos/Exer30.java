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
public class Exer30 {
    public static void main(String[] args) {
    // Criando tabuada, com numero inicial e final introduzidos pelo usuario;    
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Entre com um número para gerar a tabuada: ");
        int num = scan.nextInt();
        
        boolean invalido = true;
        int numInicio, numFim;
        
        do {            
            System.out.print("Entre com o número inícial: ");
            numInicio = scan.nextInt();
        
            System.out.print("Entre com o número final: ");
            numFim = scan.nextInt();
            
            if (numFim > numInicio){
                invalido = false;   
            }else{
            System.out.println("Numero final menor que numero inicial. Digite novamente.");
            }
            
        }while(invalido);
        
        System.out.println("Tabauda de: " + num);
        System.out.println("Inicio em: " + numInicio);
        System.out.println("Termenando em: " + numFim);
        
        for (int i=numInicio; i<=numFim; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        
        }
    }
   }
