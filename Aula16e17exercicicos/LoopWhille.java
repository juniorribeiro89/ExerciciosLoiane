/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula16e17;

/**
 *
 * @author Junior Ribeiro
 */
public class LoopWhille {
    public static void main(String[] args) {
        
        int c = 1;
        int max = 10;
        
        while (c <= 10){
            System.out.println("c agora vale: " +c);
            c++;
        
        
        System.out.println(c);
        
        do {
            c++;
            System.out.println("Valor de C: " + c);
        }while (c < 13 );
        System.out.println(c);
        
    }
    }
}
