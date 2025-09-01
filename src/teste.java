import java.util.ArrayList;
import java.util.Scanner;



public class teste {
    static void main(String[] args) {
        System.out.println("teste");
        Scanner leitor= new Scanner(System.in);

        ArrayList<Integer> listaTEste = new ArrayList<>();
        adicaolista listinha;
        listinha = new adicaolista();

        listinha.lista= listaTEste;

       /* for (int i = 0; i < 4; i++) {

            System.out.print("digita o inteiro ai: ");
            Integer var= leitor.nextInt();


        }

        for (int i = 0; i < listaTEste.size(); i++) {

            System.out.println(listaTEste.get(i));
        }*/
       do {

        String teste= leitor.nextLine();
        System.out.println(teste);
       } while (10 <9 );

    }
}

 class adicaolista {

    public ArrayList<Integer> lista;


     public void addLista( int var) {
        if (this.lista.contains(var)) {
            System.out.println("não deu pra colocar dentro da lista");

        } else {
            this.lista.add(var);
        }
    }
}

