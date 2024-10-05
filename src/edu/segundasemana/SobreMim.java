package edu.segundasemana;

import java.util.Locale;
import java.util.Scanner;
//A classe Scanner permite que o usuário tenha uma interação mais assertiva com o nosso programa

public class SobreMim {
    public static void main (String[] args){
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next(); //indica o proximo parametro

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt(); //indica que o proximo parametro é do tipo int

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
