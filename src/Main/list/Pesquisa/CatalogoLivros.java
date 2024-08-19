package Main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //Atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {

         List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
         if(!livroList.isEmpty()) {
             for (Livro l : livroList) {

                 if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                 }
             }
         }
         return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPortitulo = null;
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPortitulo =l;
                }
            }
        }
        return livroPortitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalagoLivros = new CatalogoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 1999);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2009);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2019);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 2029);
        System.out.println("Pesquisa por Titulo: ");
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 1"));
        System.out.println("Pesquisa por Intervalo por Ano: ");
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(2009, 2029));
    }
}
