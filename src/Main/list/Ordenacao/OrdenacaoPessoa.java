package Main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenaPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);

    return pessoaPorIdade;
    }
    public List<Pessoa> ordenaPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Paulo", 37, 1.70);
        ordenacaoPessoa.adicionarPessoa("Mauro", 27, 1.77);
        ordenacaoPessoa.adicionarPessoa("Jõao",  25, 1.75);
        ordenacaoPessoa.adicionarPessoa("Romam", 15, 1.80);

        System.out.println(ordenacaoPessoa.ordenaPorIdade());
        System.out.println(ordenacaoPessoa.ordenaPorAltura());
    }

}
