//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Exercicios {
    public static void main(String[] args) {
        String primeiroNome = "Gleyson";
        String segundoNome = "Roberto";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        //cachorro1(nome,comportamento);
        System.out.println(cachorro1(nome,comportamento));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}