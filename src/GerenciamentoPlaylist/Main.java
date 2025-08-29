package GerenciamentoPlaylist;
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
        String titulo;
        String autor;
        double duracao;
        do {

        System.out.println("----- BEM VINDO AO GERENCIADOR DE PLAYLISTS -----");
        System.out.println(" A baixo selecione o serviço que deseja:");
        System.out.println(" 1- Criar uma nova Playlist");
        System.out.println(" 2- Cadastrar uma nova musica");
        System.out.println(" 3- Adicionar musica a playlist");
        System.out.println(" 3- Adicionar musica a playlist");
        }while ()



        Musica m1= new Musica("teste", "gabriel",3);
        Musica m2= new Musica("ulaealalancaché", "MC laranjinha",2.5);
        Musica m3= new Musica("aiai uiui", "chico buarque",4);
        /*m1.tocarMusica();*/
        Playlist p1 = new Playlist("Primeira lista");
        System.out.println(p1.adicionarMusica(m1));
        System.out.println(p1.adicionarMusica(m2));
        System.out.println(p1.adicionarMusica(m3));
        p1.listarMusicas();
        System.out.println(p1.somarDuracao()+ " minutos");
        /*System.out.println( p1.deletarMusica(m2) );
        p1.listarMusicas();*/
        p1.tocarMusicasPlaylist();
    }
}