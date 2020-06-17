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
public class Exer04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a Letra: ");
        
       String letra = scan.next();
       
       
       if (letra.length() > 1){
            System.out.println("Letra Invalida");
       } else if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") ||
           letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
           System.out.println("É vogal");
       }else
           System.out.println("Consoante");
       
       /*
       if (letra.length() > 1){
            System.out.println("Letra Invalida");
       switch(letra.toUpperCase()){
           case "a":
           case "e":
           case "i":
           case "o":
           case "u":System.out.println("É vogal"); break;
           default:System.out.println("Consoante");*/
       
       
       
       
       }
   
       
  }  

