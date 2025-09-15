package Gerenciador_Notas;

import java.util.ArrayList;
public class Aluno{

    private final String nomeAluno;
    private final ArrayList<Double> notasAluno;

    //-------------------------- Construtor

    public Aluno(String nome){
        this.nomeAluno = nome;
        this.notasAluno = new ArrayList<>();
    }

    public ArrayList<Double> getNota(){
        return this.notasAluno;
    }

    public String getNomeAluno(){
        return this.nomeAluno;
    }


}
