package Gerenciador_Playlist;

public class Musica {

     private String titulo;
     private String artista;
     private double duracaoMinutos;

     //-------------------------COSTRUTORA E GETERS
    public Musica(String titulo, String artista, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoMinutos = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    //-------------------------METODOS ESPECIAIS
    public void tocarMusica(){

        System.out.print(" Tocando: " + this.titulo +" |> ");

        for (int i = 0; i < 30; i++) {
            System.out.print("*");
            try {
                Thread.sleep(1000);

            }catch (InterruptedException erro){
                erro.printStackTrace();
            }

        }
        System.out.println(" "+ this.duracaoMinutos + "min");
        System.out.println("-------------------------------------------------");
    }

}
