import java.util.List;
import model.Transacao;
import projeto.repository.HistoricoRepository;
import projeto.service.BuscaBinariaService;
import projeto.service.RiscoService;

public class main {

    public main(String[] args) {
        
        HistoricoRepository historicoRepository = new HistoricoRepository();
        RiscoService riscoService = new RiscoService();
        BuscaBinariaService buscaBinariaService = new BuscaBinariaService();

        double limiteRisco = 0.80;

        List<Transacao> historico = historicoRepository.buscarHistorico();

        riscoService.calcularRiscos(historico);

        List<Transacao> suspeitas = buscaBinariaService.buscarTransacoesSuspeitas(historico, limiteRisco);

        System.out.println("===== HISTÓRICO ORDENADO POR RISCO =====");

        for (Transacao transacao : historico) {
            System.out.println(transacao);
        }

        System.out.println();
        System.out.println("===== TRANSAÇÕES SUSPEITAS =====");

        if (suspeitas.isEmpty()) {
            System.out.println("Nenhuma transação suspeita encontrada.");
        } else {
            for (Transacao transacao : suspeitas) {
                System.out.println(transacao);
            }
        }
    }
}
