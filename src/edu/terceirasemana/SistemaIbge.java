package edu.terceirasemana;

// usando o enum criado "EstadosBrasileiros"

public class SistemaIbge extends EstadoBrasileiro {
    public static void main(String[] args) {
        //fazendo um loop para mostrar o conteudo do enum criado e "puxando" tudo que tem nele
        for(EstadosBrasileiros e: EstadosBrasileiros.values()){
            //System.out.println(e.getSigla()+" - "+e.getNome());
        }

        //selecionando um estado brasileiro de forma especifica:
        EstadosBrasileiros eb = EstadosBrasileiros.SAO_PAULO; //esse enum representa tudo que esta no estado "SAO_PAULO"

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
