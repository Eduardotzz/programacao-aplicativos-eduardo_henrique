import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarefa[] tarefas = new Tarefa[5];
        int total = 0;
        int opcao;

        do {
            System.out.println("=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Concluir");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                if (total < tarefas.length) {
                    System.out.print("Descrição: ");
                    tarefas[total] = new Tarefa(sc.nextLine());
                    total++;
                }
            } else if (opcao == 2) {
                for (int i = 0; i < total; i++) {
                    System.out.println((i + 1) + " - " + tarefas[i]);
                }
            } else if (opcao == 3) {
                System.out.print("Número da tarefa: ");
                int n = sc.nextInt();
                if (n > 0 && n <= total) {
                    tarefas[n - 1].setConcluida(true);
                }
            }
        } while (opcao != 4);
    }
}
