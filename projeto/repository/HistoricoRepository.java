package projeto.repository;

import model.Transacao;
import java.util.ArrayList;
import java.util.List;

public class HistoricoRepository {

    public List<Transacao> buscarHistorico() {
        List<Transacao> historico = new ArrayList<>();

        historico.add(new Transacao(1, "debito", 45.90, "08:12", "Padaria Central", "Recife", false, false));
        historico.add(new Transacao(2, "pix", 120.00, "09:45", "Mercado Bom Preço", "Recife", false, false));
        historico.add(new Transacao(3, "credito", 230.50, "12:15", "Farmácia Vida", "Olinda", false, false));
        historico.add(new Transacao(4, "pix", 980.00, "14:10", "Carlos Eduardo", "Recife", true, false));
        historico.add(new Transacao(5, "boleto", 350.00, "16:33", "Neo Energia", "Recife", false, false));
        historico.add(new Transacao(6, "pix", 4999.99, "02:17", "Conta Desconhecida", "São Paulo", true, true));
        historico.add(new Transacao(7, "debito", 27.80, "18:40", "Lanchonete Sabor", "Olinda", false, false));
        historico.add(new Transacao(8, "credito", 780.00, "20:10", "Loja Tech", "Recife", true, false));
        historico.add(new Transacao(9, "pix", 15000.00, "03:02", "Conta Externa XP", "Curitiba", true, true));
        historico.add(new Transacao(10, "boleto", 89.90, "10:45", "Spotify", "Recife", false, false));
        historico.add(new Transacao(11, "pix", 2500.00, "01:25", "Lucas Andrade", "Rio de Janeiro", true, true));
        historico.add(new Transacao(12, "credito", 320.00, "13:11", "Amazon", "Recife", false, false));
        historico.add(new Transacao(13, "debito", 18.00, "07:55", "Ônibus", "Olinda", false, false));
        historico.add(new Transacao(14, "pix", 7300.00, "02:48", "Empresa Fantasma LTDA", "Belo Horizonte", true, true));
        historico.add(new Transacao(15, "boleto", 640.00, "15:00", "Faculdade", "Recife", false, false));
        historico.add(new Transacao(16, "credito", 2100.00, "23:57", "Loja Internacional", "Miami", true, true));
        historico.add(new Transacao(17, "pix", 65.00, "11:20", "João Silva", "Recife", false, false));
        historico.add(new Transacao(18, "credito", 940.00, "19:30", "Kabum", "Recife", true, false));
        historico.add(new Transacao(19, "pix", 12000.00, "04:10", "Carteira Digital X", "Brasília", true, true));
        historico.add(new Transacao(20, "debito", 32.50, "17:05", "Cafeteria", "Olinda", false, false));

        return historico;
    }
}
