package edu.terceirasemana;

//Criando a classe NomeIdade pára usar os getters e setters da classe "GetterSetter.java"

public class NomeIdade {
    public static void main(String[] args) {
        GetterSetter felipe = new GetterSetter();
        felipe.setNome("Felipe");
        felipe.setIdade(10);

        System.out.println("O aluno "+felipe.getNome()+" tem "+felipe.getIdade()+" anos de idade.");
    }
}
