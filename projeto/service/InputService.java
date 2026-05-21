package service;

import model.Transacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputService {

    public List<Transacao> lerTransacoes() {
        List<Transacao> historico = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas transações deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\n===== Cadastro da transação " + i + " =====");

            System.out.print("Tipo da transação: ");
            String tipo = scanner.nextLine();

            System.out.print("Valor: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Horário (HH:mm): ");
            String horario = scanner.nextLine();

            System.out.print("Destinatário: ");
            String destinatario = scanner.nextLine();

            System.out.print("Cidade: ");
            String cidade = scanner.nextLine();

            boolean destinatarioNovo = lerOpcaoSimNao(
                    scanner,
                    "Destinatário novo? (1 - Sim | 2 - Não): "
            );

            boolean localizacaoDiferente = lerOpcaoSimNao(
                    scanner,
                    "Localização diferente? (1 - Sim | 2 - Não): "
            );

            scanner.nextLine();

            Transacao transacao = new Transacao(
                    i,
                    tipo,
                    valor,
                    horario,
                    destinatario,
                    cidade,
                    destinatarioNovo,
                    localizacaoDiferente
            );

            historico.add(transacao);
        }

        return historico;
    }

    private boolean lerOpcaoSimNao(Scanner scanner, String mensagem) {
        int opcao;

        while (true) {
            System.out.print(mensagem);

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                if (opcao == 1) {
                    return true;
                } else if (opcao == 2) {
                    return false;
                } else {
                    System.out.println("Erro: digite apenas 1 ou 2.");
                }
            } else {
                System.out.println("Erro: entrada inválida. Digite apenas 1 ou 2.");
                scanner.next();
            }
        }
    }
}