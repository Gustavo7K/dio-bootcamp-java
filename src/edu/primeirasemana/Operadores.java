package edu.primeirasemana;
/* O intuito desse exercicio era ver como o operador "+" funciona no quesito
 concatenação, e tambem como a linguagem se comporta quando há uma reescrita
 da mesma variavel com valores "diferentes" (usando a função debug para acompanhar
 passo a passo a reatribuição de valores das variaveis).
*/
public class Operadores {
    public static void main(String[] args){
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
    }
}
