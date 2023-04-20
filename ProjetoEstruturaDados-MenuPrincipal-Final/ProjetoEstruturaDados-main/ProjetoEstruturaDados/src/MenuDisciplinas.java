import java.util.Scanner;

public class MenuDisciplinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        ListaDisciplinas lista = new ListaDisciplinas();

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar Disciplina");
            System.out.println("2. Mostrar Disciplinas");
            System.out.println("0. Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    adicionarDisciplina(lista, sc);
                    break;
                case 2:
                    mostrarDisciplinas(lista);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void adicionarDisciplina(ListaDisciplinas lista, Scanner sc) {
        System.out.println("\nAdicionar Disciplina:");
        System.out.print("Digite o nome da disciplina: ");
        String nome = sc.next();
        System.out.print("Digite a nota da disciplina: ");
        double nota = sc.nextDouble();
        lista.adicionarDisciplina(nome, nota);
        System.out.println("Disciplina adicionada com sucesso!");
    }

    public static void mostrarDisciplinas(ListaDisciplinas lista) {
        System.out.println("\nLista de Disciplinas:");
        lista.mostrarDisciplinas();
    }
}
