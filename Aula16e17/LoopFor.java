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
public class LoopFor {
    
    public static void main(String[] args) {
       /* for (int c = 0; c <=10 ; c++){
        System.out.println(c);
       }
        
        for (int c = 10; c > 0; c--){
            System.out.println(c);
        }*/
        
        for (int c = 0, j = 10; c <= j; c++, j--){
            System.out.println("C igual: "+ c + "; J igua: " + j);
        }
        
        int c = 0;
        for ( ; c <= 10; ){
            System.out.println("Valor de c: " + c);
            c +=2;
        }
        
        for ( int cont =0; cont < 10; cont +=2 ){
            System.out.println("Valor de cont: " + cont);
        }
        
        
    }
    
}
