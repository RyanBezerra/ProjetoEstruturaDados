import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Menu Alunos");
            System.out.println("2. Menu Disciplinas");
            System.out.println("0. Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Principal.main(args);
                    break;
                case 2:
                    MenuDisciplinas.main(args);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
