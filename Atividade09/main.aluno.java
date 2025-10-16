import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];
        int total = 0;
        int opcao;

        do {
            System.out.println("=== SISTEMA DE NOTAS ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Boletins");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                if (total < alunos.length) {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Nota 1: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Nota 2: ");
                    double n2 = sc.nextDouble();
                    System.out.print("Nota 3: ");
                    double n3 = sc.nextDouble();
                    sc.nextLine();
                    alunos[total] = new Aluno(nome, n1, n2, n3);
                    total++;
                }
            } else if (opcao == 2) {
                for (int i = 0; i < total; i++) {
                    System.out.println((i + 1) + " - " + alunos[i]);
                }
            }
        } while (opcao != 3);
    }
}
