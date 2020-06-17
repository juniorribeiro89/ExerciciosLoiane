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
public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean notaValida = true;
        
    do{    
        System.out.println("Digite uma Nota entre 0 e 10: ");
        double nota = scan.nextDouble();
        
        if (nota >= 0 && nota <= 10){
            notaValida = false;
            System.out.println("Nota valida: " + nota);       
        }else{
            System.out.println("Nota Invalida, Digite novamente: ");
        }        
    }while(notaValida);
        
    }
    
}
