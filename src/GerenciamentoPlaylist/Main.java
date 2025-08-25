package GerenciamentoPlaylist;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*int var1= 1;

        for (int i = 0; i < 3; i++) {
            System.out.println(var1++);

            try {
                Thread.sleep(2000);

            }catch (InterruptedException erro){
                erro.printStackTrace();
            }
        }*/

        /*String[] estados = {"Carregando.", "Carregando..", "Carregando..."};

        for (int i = 0; i < 10; i++) {
            System.out.print("\r" + estados[i % estados.length]); // substitui a linha
            Thread.sleep(500);
        }*/

        Musica m1= new Musica("teste", "gabriel",3);
        m1.tocarMusica();

    }
}