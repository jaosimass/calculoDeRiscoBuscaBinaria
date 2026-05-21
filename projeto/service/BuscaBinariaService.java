package service;

import model.Transacao;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BuscaBinariaService {

    public void ordenarPorRisco(List<Transacao> historico) {
        historico.sort(Comparator.comparingDouble(Transacao::getRisco));
    }

    public int buscarPrimeiraTransacaoSuspeita(List<Transacao> historico, double limiteRisco) {
        int inicio = 0;
        int fim = historico.size() - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (historico.get(meio).getRisco() >= limiteRisco) {
                resultado = meio;
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return resultado;
    }

    public List<Transacao> buscarTransacoesSuspeitas(List<Transacao> historico, double limiteRisco) {
        ordenarPorRisco(historico);

        int indice = buscarPrimeiraTransacaoSuspeita(historico, limiteRisco);

        if (indice == -1) {
            return new ArrayList<>();
        }

        return historico.subList(indice, historico.size());
    }
}
