package Gerenciador_Notas;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciadorNotas{

    private HashMap< String, ArrayList<Double> > dicionario;

    //------------------------ Construtor

    public GerenciadorNotas(){

        this.dicionario= new HashMap<>();
    }

    public HashMap<String, ArrayList<Double>> getDicionario() {
        return dicionario;
    }
    //------------------------ Especiais

    public void adicionarDadosAluno(Aluno aluno){

        String chave = aluno.getNomeAluno();

        ArrayList<Double> valor = aluno.getNota();

        this.dicionario.put(chave, valor);

        ArrayList< Double > valorRetorno= this.dicionario.get(chave);

    }

    public boolean BuscarAlunos(String chave){
        return this.dicionario.containsKey(chave);
    }

    public ArrayList<Double> getNotas(String chave){
        return dicionario.get(chave);
    }
}
