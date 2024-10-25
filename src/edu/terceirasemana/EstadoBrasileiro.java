package edu.terceirasemana;

//Aprendendo sobre ENUMS e usando getters e setters em conjunto com enums.

public class EstadoBrasileiro {
    public enum EstadosBrasileiros{
        SAO_PAULO("SP", "São Paulo", 11), //sigla , nome do estado , numero IBGE do estado
        RIO_DE_JANEIRO("RJ", "Rio de Janeiro",12),
        PIAUI("PI", "Piauí",13),
        MARANHAO("MA", "Maranhão",14),
        CEARA("CE", "Ceará",15),
        ;

        private final String nome;
        private final String sigla;
        private final int ibge;

        //construtor enum (atributo "private" é redundante na definição do construtor)
        EstadosBrasileiros(String sigla, String nome, int ibge) {
            this.sigla = sigla;
            this.nome = nome;
            this.ibge = ibge;
        }

        public int getIbge() {
            return ibge;
        }

        public String getNome() {
            return nome;
        }

        public String getSigla() {
            return sigla;
        }

        public String getNomeMaiusculo(){
            return nome.toUpperCase();
        }
    }
}
