package edu.segundasemana;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
Ao executar o código Java, diferentes erros podem acontecer:
erros de codificação feitos pelo programador, erros devido a
entrada errada ou outros imprevistos. Quando ocorre um erro, o Java
normalmente para e gera uma mensagem de erro. O termo técnico
para isso é: Java lançará uma exceção ("throws exception" jogará um erro).
 */

public class Excecoes {
    public static void main(String[] args) {
        try { //um bloco de código para ser testado quanto a erros enquanto está sendo executado
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //criando o objeto scanner

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }
        catch(InputMismatchException e){
            // esse é um bloco de código que captura as exceções que podem acontecer em caso de um fluxo não previsto
            System.out.println("Os campos idade e altura precisam ser numéricos e/ou " +
                    " com valor do tipo numérico decimal no formato americano, exemplo: 1.65");
        }
    }
}
