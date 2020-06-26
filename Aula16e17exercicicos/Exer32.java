package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula16e17exercicicos;
import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer32 {
    public static void main(String[] args) {
        //Gerando um Cardapio !!!
        Scanner scan = new Scanner( System.in);
         
        boolean naoTerminar = true;
        int cod, qtd;
        double total = 0;
        String output = "";
        
        do{
        
            System.out.println("Digite o codigo e a quantidade. Digite 0 0 para sair.");
            cod = scan.nextInt();
            qtd = scan.nextInt();
            
            if ( cod ==0 && qtd ==0){
                naoTerminar = false;          
                output += "Total a pagar = " + total;
            }else{
                
                if (cod == 100){
                    output += "Cachorro Quente -> 1,20 * " + qtd;
                    output += " = " + (1.20 * qtd) + "\n";
                    total += 1.20 * qtd;
                    
                } else if (cod == 101){
                    output += " Bauru Simples -> 1,30 * " + qtd;
                    output += " = " + (1.30 * qtd) + "\n";
                    total += 1.30 * qtd;
                    
                }else if (cod == 102){
                    output += " Bauru com ovo -> 1,50 * " + qtd;
                    output += " = " + (1.50 * qtd) + "\n";
                    total += 1.50 * qtd;
                    
                }else if (cod == 103){
                    output += "Hamburguer -> 1,20 * " + qtd;
                    output += " = " + (1.20 * qtd) + "\n";
                    total += 1.20 * qtd;
                    
                }else if (cod == 104){
                    output += "Cheeseburguer -> 1,30 * " + qtd;
                    output += " = " + (1.30 * qtd) + "\n";
                    total += 1.30 * qtd;
                    
                }else if (cod == 105){
                    output += "Refrigerante -> 1,00 * " + qtd;
                    output += " = " + (1 * qtd) + "\n";
                    total += 1 * qtd;
                }
            }
            
        }while(naoTerminar);
        
        System.out.println(output);
        
    }
    
}
