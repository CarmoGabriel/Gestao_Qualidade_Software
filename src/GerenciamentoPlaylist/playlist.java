package GerenciamentoPlaylist;
import java.util.ArrayList;
public class playlist   {
    private String nomePlaylist;
    private ArrayList<Musica> listaMusicas;
    private double duracaoPlaylist;

    public playlist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public String adicionarMusica(Musica musica){

       if (!this.listaMusicas.contains(musica)) {
           this.listaMusicas.add(musica);
           return "Musica adicionada!";

       }else {
            return "Musica já existente na playlist";
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

    public void listarMusicas(){
        String[] infoMusicas= new String[this.listaMusicas.size()];

        for (int i = 0; i < this.listaMusicas.size(); i++) {
            infoMusicas[i] = this.listaMusicas.get(i).getTitulo()+"|"+this.listaMusicas.get(i).getArtista()+"|"+this.listaMusicas.get(i).getDuracaoMinutos();
        }
    }
}
