import java.util.Scanner;
//codigo basico para praticar multiplicação entre dois numeros
public class Multiplicacao {
    public static void main(String[] args) {
        System.out.println("Essa é uma calculadora simples de multiplicações atente-se as informações abaixo: \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero a ser multiplicado: ");
        int numeroMultiplicado = scanner.nextInt();
        System.out.println("Agora o numero multiplicador: ");
        int multiplicador = scanner.nextInt();

        int resultado = numeroMultiplicado * multiplicador;
        System.out.println(numeroMultiplicado+" x "+multiplicador+" = "+resultado);
    }
}

//código teste de multiplicação infinita entre dois numeros aleatorios gerados pelo codigo*/
    /*while (numeroMultiplicado() < 11){
            int numero = numeroMultiplicado();
            int resultado = numeroMultiplicado() * multiplicador();
            System.out.println(numero+" X "+multiplicador()+" = "+resultado );
        }
    }
    static int numeroMultiplicado(){
        return ThreadLocalRandom.current().nextInt(1,11);
    }
    static int multiplicador(){
        return ThreadLocalRandom.current().nextInt(1,11);
    } //multiplicação infinita entre dois numeros aleatorios gerados pelo codigo*/
