package Main.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CarrinhodeCompras {
    private final List<Item> listaItems;

    public CarrinhodeCompras() {
        this.listaItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double valor, int quantidade) {
        Item item = new Item(nome, valor, quantidade);
        this.listaItems.add(item);
    }

    public void removerItem(String nome) {

        Iterator<Item> iterator = listaItems.iterator();

        while (iterator.hasNext()) {
            Item item = iterator.next();

            if (next.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
            }

        }
    }

    public Double calcularTotal() {
        double total = 0d;
        for (Item item : listaItems) {

            double valorItem = item.getPreco() * getQuant();
            total += valorItem;
        }
        return total;

    }

    public void exibirItens() {
        System.out.println(this.itens);
    }

    @Override
    public String toString() {
        return "CarrinhodeCompras{" +
                "Itens = " + listaItems +
                '}';
    }

}