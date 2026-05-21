package model;

    public class Transacao {
        private int id;
        private String tipo;
        private double valor;
        private String horario;
        private String destinatario;
        private String cidade;
        private boolean destinatarioNovo;
        private boolean localizacaoDiferente;
        private double risco;

        public Transacao(int id, String tipo, double valor, String horario, String destinatario,
                    String cidade, boolean destinatarioNovo, boolean localizacaoDiferente) {
            this.id = id;
            this.tipo = tipo;
            this.valor = valor;
            this.horario = horario;
            this.destinatario = destinatario;
            this.cidade = cidade;
            this.destinatarioNovo = destinatarioNovo;
            this.localizacaoDiferente = localizacaoDiferente;
            this.risco = 0.0;
        }

        public int getId() {
            return id;
        }

        public String getTipo() {
            return tipo;
        }

        public double getValor() {
            return valor;
        }

        public String getHorario() {
            return horario;
        }

        public String getDestinatario() {
            return destinatario;
        }

        public String getCidade() {
            return cidade;
        }

        public boolean isDestinatarioNovo() {
            return destinatarioNovo;
        }

        public boolean isLocalizacaoDiferente() {
            return localizacaoDiferente;
        }

        public double getRisco() {
            return risco;
        }

        public void setRisco(double risco) {
            this.risco = risco;
        }

        @Override
        public String toString() {
            return "ID: " + id +
                    " | Tipo: " + tipo +
                    " | Valor: R$ " + valor +
                    " | Horário: " + horario +
                    " | Destinatário: " + destinatario +
                    " | Cidade: " + cidade +
                    " | Risco: " + String.format("%.0f", risco * 100) + "%";
        }
    }
