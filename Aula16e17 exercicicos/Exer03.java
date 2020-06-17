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
public class Exer03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean inforValidas = false;
        
        String nomeUser;
        int idadeUser;
        double salarioUser;
        String generoUser;
        String estadoCivilUser;
        
        do{
            System.out.println("Entre com Seu Nome: ");
            nomeUser = scan.next();
            if (nomeUser.length() >= 3){
                inforValidas = true;
            } else{
                System.out.println("Nome Menor de 3 letras, Digite novamente ");
            }
        }while(!inforValidas);

        
        inforValidas = false;
        do{
            System.out.println("Digite Sua Idade: ");
            idadeUser = scan.nextInt();
            if (idadeUser >= 18 && idadeUser <=80 ){
                inforValidas = true;            
            }else {
                System.out.println("Idade Menor que 18 ou maior que 80");
            }
        }while(!inforValidas);
        
        
        inforValidas = false;
        do{
            System.out.println("Digite Seu Salario: ");
            salarioUser = scan.nextDouble();
            if (salarioUser > 0){
                inforValidas = true;      
            }else{
                System.out.println("Salario menor que Zero: ");
            }
        }while(!inforValidas);
        
        inforValidas = false;
        do{
            System.out.println("Digite o Genero: ");
            generoUser = scan.next();
            if (generoUser.equalsIgnoreCase("m") || generoUser.equalsIgnoreCase("f")){
                inforValidas = true;
            }else{
                System.out.println("Sexo Invalido: ");    
            }
        }while(!inforValidas);
        
        inforValidas = false;
        do{
            System.out.println("Estado Civil: ");
            estadoCivilUser = scan.next();
            if(estadoCivilUser.equalsIgnoreCase("c") || 
                    estadoCivilUser.equalsIgnoreCase("s") || 
                    estadoCivilUser.equalsIgnoreCase("v") || 
                    estadoCivilUser.equalsIgnoreCase("d")){
                inforValidas = true;
            }else{
                System.out.println("Estado Civil Errado!");
            }
        }while(!inforValidas);
        
        System.out.println("Informações" );
        System.out.println("Nome: " + nomeUser);
        System.out.println("idade: " + idadeUser);
        System.out.println("salario: " + salarioUser);
        System.out.println("Genero: " + generoUser);
    }
}
