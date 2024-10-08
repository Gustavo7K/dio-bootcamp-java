package edu.segundasemana;
// criando uma exceção propria baseada em regras ficticias de negocio

// Como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos,
// caso contrário lançará uma exceção que denominamos de FormatarCepExemplo.
public class FormatarCepExemplo extends Exception {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
            } catch (FormatarCepExemplo e) {
            System.out.println("o Cep nao esta dentro das regras do negócio");
        }
    }
    static String formatarCep(String cep) throws FormatarCepExemplo{
        if(cep.length() != 8)
            throw new FormatarCepExemplo();
        //simulando um cep formatado
        return "23.765-064";
    }
}
