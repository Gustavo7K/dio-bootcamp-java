package edu.terceirasemana;

//Estudando sobre getters e setters e visibilidade de classes e variaveis

public class GetterSetter {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String newNome){
        nome = newNome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }
}
