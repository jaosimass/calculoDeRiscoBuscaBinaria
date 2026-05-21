package service;

import model.Transacao;
import java.util.List;

public class RiscoService {

    public void calcularRiscos(List<Transacao> historico) {
        for (Transacao transacao : historico) {
            double risco = calcularRisco(transacao);
            transacao.setRisco(risco);
        }
    }

    private double calcularRisco(Transacao transacao) {
        double risco = 0.0;

        if (transacao.getTipo().equalsIgnoreCase("pix")) {
            risco += 0.15;
        }

        if (transacao.getValor() > 1000) {
            risco += 0.25;
        }

        if (transacao.getValor() > 5000) {
            risco += 0.25;
        }

        if (isHorarioSuspeito(transacao.getHorario())) {
            risco += 0.20;
        }

        if (transacao.isDestinatarioNovo()) {
            risco += 0.20;
        }

        if (transacao.isLocalizacaoDiferente()) {
            risco += 0.25;
        }

        return Math.min(risco, 1.0);
    }

    private boolean isHorarioSuspeito(String horario) {
        int hora = Integer.parseInt(horario.substring(0, 2));
        return hora >= 0 && hora <= 5;
    }
}
