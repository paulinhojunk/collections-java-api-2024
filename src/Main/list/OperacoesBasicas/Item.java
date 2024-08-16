package Main.list.OperacoesBasicas;

public class Item {
    private String nome;
    private Double valor;
    private Integer quantidade;

    public Item(String nome) {
        this.nome = nome;
    }

    public Item(Double valor) {
        this.valor = valor;
    }

    public Item(String nome, double valor, Integer quantidade) {
        this.quantidade = quantidade;
    }
}
