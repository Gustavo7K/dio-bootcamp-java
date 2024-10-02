package edu.primeirasemana;
//exemplos de metodos
public class Metodos {

    public double somar(int num1, int num2){
        int primeiroNumero = 10;
        int segundoNumero = 20;
        return primeiroNumero + segundoNumero ; //metodo que retorna valor (no caso a soma de duas variaveis)
    }

    public void imprimir(String texto){
        System.out.println("Metodo imprimir"); //metodo que nao tem retorno *void*
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        // throws Exception: indica que o método ao ser utilizado poderá gerar uma exceção
        return 0;
    }

    private void metodoPrivado() {
        //este método nao pode ser visto por outras classes no projeto
    }
}
