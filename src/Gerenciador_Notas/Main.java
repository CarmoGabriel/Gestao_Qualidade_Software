package Gerenciador_Notas;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        GerenciadorNotas bancoNotas= new GerenciadorNotas();

        int option;
        Aluno a1 = null;
        Aluno[] listaAlunos;
        int tamanhoLista;
        String nomeAluno;
        String nomeBusca;


        System.out.println("Bem vindo ao programa de organização de notas!");
        System.out.println("em que posso te ajudar?");

        do{
            System.out.println("---------------------------------------------------");
            System.out.println("1- Cadastrar Alunos");
            System.out.println("2- adicionar nota de um aluno");
            System.out.println("3- exibir notas de um aluno");
            System.out.println("4- calcular nota de um aluno");
            System.out.println("5- sair");
            option = input.nextInt();
            input.nextLine();



            switch(option){

                case 1-> {
                    System.out.println(" Quantos alunos deseja cadastrar?");
                    tamanhoLista= input.nextInt();
                    input.nextLine();
                    listaAlunos= new Aluno[tamanhoLista];

                    System.out.println(" Ok seguiremos com a criação da lista de alunos:");

                    for (int i = 0; i < tamanhoLista; i++) {

                        System.out.println((i+1)+"- Digite o nome do aluno:");  //entrada
                        nomeAluno= input.nextLine();
                        input.nextLine();

                        listaAlunos[i]= new Aluno(nomeAluno);  // armazenamento

                        bancoNotas.adicionarDadosAluno( listaAlunos[i] ); //guarda no HasMap
                    }

                    System.out.println(" Aluno cadastrado!");
                    System.out.println(" ");
                }

                case 2-> {
                    System.out.println(" Para adicionar nota a um aluno me informe:");
                    System.out.print(" Qual é o nome do aluno? ");
                    nomeBusca= input.nextLine();

                    if (!bancoNotas.BuscarAlunos(nomeBusca)) {
                        System.out.println(" Não há nenhum aluno com o nome '"+ nomeBusca + "'!");
                        continue;
                    }
                    int response;

                    do {
                        System.out.println(" Digite a nota do aluno:");
                        double nota = input.nextDouble();
                        input.nextLine();

                        bancoNotas.getDicionario().get(nomeBusca).add(nota);

                        System.out.println(" Nota adicionada!");
                        System.out.println(" ");

                        System.out.println(" Deseja anotar outra nota?");
                        System.out.println(" 1- Sim | 2- Não ");
                        response = input.nextInt();

                    } while (response != 2);

                }

                case 3-> {
                    System.out.println(" Para exibir a nota de um aluno, me informe:");
                    System.out.print("Qual é o nome do aluno? ");
                    nomeBusca= input.nextLine();

                    if (!bancoNotas.BuscarAlunos(nomeBusca)) {
                        System.out.println(" Não há nenhum aluno com o nome '"+ nomeBusca + "'!");
                        continue;
                    }

                    System.out.println(" Notas do aluno: "+ nomeBusca);

                    int ordem= 1;
                    for(double i: bancoNotas.getNotas(nomeBusca)){
                        System.out.println(ordem +"°: "+ i );
                        ordem++;
                    }
                    System.out.println(" ");
                }

                case 4->{
                    System.out.println(" Para calcular a média de notas de um aluno, me informe:");
                    System.out.print("Qual é o nome do aluno? ");
                    nomeBusca= input.nextLine();

                    if(!bancoNotas.BuscarAlunos(nomeBusca)){
                        System.out.println(" Não há nenhum aluno com o nome '"+ nomeBusca + "'!");
                        continue;
                    }

                    double notasSomadas = 0;
                    int posicao= 0;
                    double[] notasVetor= new double[ bancoNotas.getNotas(nomeBusca).size() ];

                    for (double i : bancoNotas.getNotas(nomeBusca)){
                        notasVetor[ posicao ] = i;
                        notasSomadas += i;
                        posicao ++;
                    }
                    double media= notasSomadas/ bancoNotas.getNotas(nomeBusca).size();

                    System.out.println("Com base nas seguintes notas do aluno "+ nomeBusca);
                    System.out.println(Arrays.toString(notasVetor));
                    System.out.println("Sua média é: "+ media);
                    System.out.println(" ");
                }

                case 5 ->{
                    break;
                }

                default -> {
                    System.out.println(" Opção incorreta! Tente novamente:");
                }
            }

        }while (option != 5 );

    }
}