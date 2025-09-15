package Gerenciador_Playlist;
import java.util.ArrayList;

public class Playlist {

    private String nomePlaylist;
    private ArrayList<Musica> listaMusicas;
    private double duracaoPlaylist;


    //----------------------- CONSTRUTORES E ACESSORES-----------------------------------
    public Playlist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
        this.listaMusicas = new ArrayList<>();
    }


    //----------------------- METODOS ESPECIAIS -----------------------------------
    public String adicionarMusica(Musica musica){
        if ( this.listaMusicas.contains(musica) ) {
             return "Musica já existente na playlist!";

        } else {
            this.listaMusicas.add(musica);
            return "Musica adicionada!";

        }

    }

    public void listarMusicas(){
        String[] infoMusicas;
        infoMusicas = new String[this.listaMusicas.size()];

        System.out.println( this.nomePlaylist + "________________________" );

        for (int i = 0; i < this.listaMusicas.size(); i++) {
            infoMusicas[i] = (i+1)+ "- " + this.listaMusicas.get(i).getTitulo()+ "|" +this.listaMusicas.get(i).getArtista()+ "|" +this.listaMusicas.get(i).getDuracaoMinutos();
            System.out.println(infoMusicas[i]);

        }

        System.out.println("--------------------------------------");
    }

    public double somarDuracao(){

        for (int i = 0; i < this.listaMusicas.size(); i++) {
            double tempoMusica= this.listaMusicas.get(i).getDuracaoMinutos();
            this.duracaoPlaylist += tempoMusica;
        }
        return this.duracaoPlaylist;
    }

    public void tocarMusicasPlaylist(){
        System.out.println("tocando a playslist "+ this.nomePlaylist);
        for (int i = 0; i < this.listaMusicas.size(); i++) {
            this.listaMusicas.get(i).tocarMusica();
        }
    }

    public String deletarMusica(Musica musica){
        if(this.listaMusicas.contains(musica)){
            this.listaMusicas.remove(musica);
            return "Musica deletada!";

        } else {
            return "Musica não encontrada na Plailyst!";

        }
    }
}

