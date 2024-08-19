package Main.list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoConvidados {
    // ATRIBUTOS

    public Set<Convidados> convidadoSet;

    public ConjuntoConvidados() {

        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){

        convidadoSet.add(new Convidados(nome, codigoConvite));
            }
    public void removerPeloCodigoConvite(int codigoConvite){

        Convidados convidadoParaRemover = null;
        for(Convidados c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 123);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 12);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+ " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerPeloCodigoConvite(123);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+ " convidado(s) dentro do Set de Convidados");
    }
}
