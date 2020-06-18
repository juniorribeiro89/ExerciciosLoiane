package com.loiane.cursojava.aula16e17;
import java.util.Scanner;
/**
 *
 * @author Junior Ribeiro
 */
public class Exer21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o Numero de Turmas: ");
        int numTurmas = scan.nextInt();
        
        int numAlunos;
        int soma = 0;
        boolean invalido = true;
        
        
        for (int i=1; i <= numTurmas; i++){
            
            invalido = true;            
            do {
                System.out.println("Entre com o numero de alunos da turma " + i);
                numAlunos = scan.nextInt();

                if (numAlunos <= 40){
                    invalido = false;
                }else{
                    System.out.println("Numero de Alunos Invalido. Digite Novamente!");
                }
        
            }while(invalido);
            
            soma += numAlunos;
         }
        
        double media = soma / numTurmas;
        System.out.println("Média: " + media);
        
        
    } 
}
