package gerenciamentoT;

public class ProgramP {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar Java", "Fazer exercícios de orientação a objetos");
        Tarefa tarefa2 = new Tarefa("Academia", "Treino de pernas");

        tarefa1.AdicionarTarefa(tarefa1);
        tarefa2.AdicionarTarefa(tarefa2);
        tarefa1.ListaTarefas();
        tarefa2.ListaTarefas();
    }
}
