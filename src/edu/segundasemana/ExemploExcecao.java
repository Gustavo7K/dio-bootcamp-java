package edu.segundasemana;

import java.text.NumberFormat;
import java.text.ParseException;

/*
A linguagem Java dispõe de uma variedade de classes que representam exceções,
e estas classes são organizadas em uma hierarquia denominadas Exceções Checadas e Não Checadas.
 */
public class ExemploExcecao {
    public static void main(String[] args){
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    /* as linhas 12 e 14 apresentarão uma exceção ao serem executadas, e a linha 14 contém
     uma instrução que pode disparar uma exceção checada, para utiliza-la teremos que
     tratá-la explicitamente com  try \ catch
    */
    }
}
