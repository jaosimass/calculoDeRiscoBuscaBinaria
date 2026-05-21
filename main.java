import model.Transacao;
import service.BuscaBinariaService;
import service.InputService;
import service.RiscoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputService inputService = new InputService();
        RiscoService riscoService = new RiscoService();
        BuscaBinariaService buscaBinariaService = new BuscaBinariaService();

        List<Transacao> historico = new ArrayList<>();
        List<Transacao> suspeitas = new ArrayList<>();

        double limiteRisco = 0.80;
        int opcao;

        do {
            System.out.println("\n===== SISTEMA ANTIFRAUDE BANCÁRIA =====");
            System.out.println("1 - Cadastrar transações");
            System.out.println("2 - Analisar transações");
            System.out.println("3 - Exibir histórico");
            System.out.println("4 - Exibir transações suspeitas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    historico = inputService.lerTransacoes();
                    System.out.println("\nTransações cadastradas com sucesso!");
                    break;

                case 2:
                    if (historico.isEmpty()) {
                        System.out.println("\nCadastre transações antes de analisar.");
                    } else {
                        riscoService.calcularRiscos(historico);
                        suspeitas = buscaBinariaService.buscarTransacoesSuspeitas(historico, limiteRisco);
                        System.out.println("\nAnálise concluída!");
                    }
                    break;

                case 3:
                    if (historico.isEmpty()) {
                        System.out.println("\nNenhuma transação cadastrada.");
                    } else {
                        System.out.println("\n===== HISTÓRICO DE TRANSAÇÕES =====");
                        for (Transacao transacao : historico) {
                            System.out.println(transacao);
                        }
                    }
                    break;

                case 4:
                    if (suspeitas.isEmpty()) {
                        System.out.println("\nNenhuma transação suspeita encontrada ou análise ainda não realizada.");
                    } else {
                        System.out.println("\n===== TRANSAÇÕES SUSPEITAS =====");
                        for (Transacao transacao : suspeitas) {
                            System.out.println(transacao);
                        }
                    }
                    break;

                case 5:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}