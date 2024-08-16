package Main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private final List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));

    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int quantidadeTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        //Adicionando tarefa
        listaTarefa.adicionarTarefa("Tarefa-01");
        listaTarefa.adicionarTarefa("Tarefa-02");
        listaTarefa.adicionarTarefa("Tarefa-03");

        //Listando a quantidade de tarefas
        System.out.println("O numero total de elementos na lista é : "+ listaTarefa.quantidadeTarefas());
        //Obtendo as descrições das tarefas
        listaTarefa.obterDescricoesTarefas();

    }
}
