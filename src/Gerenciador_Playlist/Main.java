package Gerenciador_Playlist;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        /* int var1= 1;

        for (int i = 0; i < 3; i++) {
            System.out.println(var1++);

            try {
                Thread.sleep(2000);

            }catch (InterruptedException erro){
                erro.printStackTrace();
            }
        }*/ // inpressão de valores na mesma linha

        /*String[] estados = {"Carregando.", "Carregando..", "Carregando..."};

        for (int i = 0; i < 10; i++) {
            System.out.print("\r" + estados[i % estados.length]); // substitui a linha
            Thread.sleep(500);
        }*/ // carregando ...

        Scanner entrada= new Scanner(System.in);
        Playlist objPlaylist= null;
        Musica objMusica= null;
        int option;
        String titulo;
        String autor;
        double duracao;

        System.out.println("----- BEM VINDO AO GERENCIADOR DE PLAYLISTS -----");

        do {
            System.out.println("_________________________________________________");
            System.out.println(" A baixo selecione o serviço que deseja:");
            System.out.println(" 1- Criar uma nova Playlist");
            System.out.println(" 2- Cadastrar uma nova musica");
            System.out.println(" 3- Adicionar musica a playlist");
            System.out.println(" 4- Tocar musica");
            System.out.println(" 5- Tocar musicas da playlist");
            System.out.println(" 6- sair");

            option =  entrada.nextInt();
            entrada.nextLine();

            System.out.println("-------------------------------------------------");
            switch (option){

                case 1:
                    System.out.println("Para criar uma nova playlist digite o nome da playlist:");
                    String nomePlaylist= entrada.nextLine();
                    objPlaylist = new Playlist( nomePlaylist );
                    System.out.println("A playlist "+ nomePlaylist+ " foi crida!");
                    continue;

                case 2:
                    System.out.println("Para cadastrar uma nova musica ");
                    System.out.println("digite o nome da mucica: ");
                    titulo= entrada.nextLine();
                    System.out.println("digite o autor(a) da mucica: ");
                    autor= entrada.nextLine();
                    System.out.println("digite o tempo de duração da musica: ");
                    duracao= entrada.nextDouble();
                    objMusica = new Musica(titulo, autor, duracao);

                    System.out.println("'"+objMusica.getTitulo()+"' cadastrada com sucesso!");
                    continue;

                case 3:
                    if (objPlaylist != null && objMusica != null){
                        System.out.println( objPlaylist.adicionarMusica(objMusica) );
                        continue;
                    }else {
                        System.out.println("Para que uma musica seja adicionada, preciso que a playlist e a musica sejam ciradas");
                        continue;
                    }

                case 4:
                    if (objMusica != null) {
                        objMusica.tocarMusica();
                        continue;
                    } else {
                        System.out.println("Musica ainda não existe");
                    }

                case 5:
                    if (objPlaylist != null) {
                        objPlaylist.tocarMusicasPlaylist();
                        continue;
                    }else {
                        System.out.println("Playlist ainda não existe");
                        continue;
                    }

                case 6:
                    System.out.println("saindo...");
                    System.out.println("Muito obrigado! Até mais");
                    break;

                default:
                    System.out.println("opção incorreta! tente novamente: ");
            }

        }while (option != 6);



        /*Musica m1= new Musica("teste", "gabriel",3);
        Musica m2= new Musica("ulaealalancaché", "MC laranjinha",2.5);
        Musica m3= new Musica("aiai uiui", "chico buarque",4);
        *//*m1.tocarMusica();*//*
        Playlist p1 = new Playlist("Primeira lista");

        System.out.println(p1.adicionarMusica(m1));
        System.out.println(p1.adicionarMusica(m2));
        System.out.println(p1.adicionarMusica(m3));
        p1.listarMusicas();
        System.out.println(p1.somarDuracao()+ " minutos");
        *//*System.out.println( p1.deletarMusica(m2) );
        p1.listarMusicas();*//*
        p1.tocarMusicasPlaylist();*/
    }
}