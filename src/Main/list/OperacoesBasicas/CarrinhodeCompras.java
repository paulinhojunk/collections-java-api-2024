package Main.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class CarrinhodeCompras {
    private final List<Item> listaItens;

    public CarrinhodeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double valor, int quantidade) {
        Item item = new Item(nome, valor, quantidade);
        this.listaItens.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        if(!listaItens.isEmpty()){
            for(Item i : listaItens){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensRemover.add(i);
                }
            }

            listaItens.removeAll(itensRemover);

        }else {
            System.out.println("A lista está vazia");
        }


    }

    public double calcularTotal() {
        double total = 0d;
        if (!listaItens.isEmpty()) {
            for (Item item : listaItens) {

                double valorItem = item.getValor() * item.getQuantidade();
                total += valorItem;
            }
            return total;
        }else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirItens() {
        if(!listaItens.isEmpty()) {
            System.out.println(this.listaItens);
        } else {

            System.out.println("A lista está vaiza!");
        }

    }

    @Override
    public String toString() {
        return "CarrinhodeCompras{" +
                "Itens = " + listaItens +
                '}';
    }

    public static void main(String[] args) {
        // Criando instância Carrinho de compra
        CarrinhodeCompras carrinhodeCompras = new CarrinhodeCompras();

        // Adicionando itens no carrinho de compras
        carrinhodeCompras.adicionarItem("Arroz", 23d, 2);
        carrinhodeCompras.adicionarItem("Feijão", 8d, 3);
        carrinhodeCompras.adicionarItem("Macarrão", 3d, 1);
        carrinhodeCompras.adicionarItem("Farinha", 13d, 4);

        // Exibindo os itens do carrinho de compras
        carrinhodeCompras.exibirItens();

        // Remover itens do carrinho de compras
        carrinhodeCompras.removerItem("Farinha");

        // Atualizando os itens do carrinho de compras
        carrinhodeCompras.exibirItens();

        // Calculando o total do carrinho de compras

        System.out.println("Valor total da compra: " + carrinhodeCompras.calcularTotal());




    }

}