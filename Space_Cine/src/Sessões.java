public class Sessões {

    public class Sessao {

        private int id;
        private String filme;
        private int numSala;
        private int dt;
        private String tipo;
        private double hora;
        private String local;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getHora() {
            return hora;
        }

        public void setHora(double hora) {
            this.hora = hora;
        }

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public int getNumSala() {
            return numSala;
        }

        public void setNumSala(int numSala) {
            this.numSala = numSala;
        }

        public String getFilme() {
            return filme;
        }

        public void setFilme(String filme) {
            this.filme = filme;
        }

        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Sessao() {
        }

        public Sessao(String filme, int numSala, int dt, String tipo, double hora, String local) {
            this.filme = filme;
            this.numSala = numSala;
            this.dt = dt;
            this.tipo = tipo;
            this.hora = hora;
            this.local = local;
        }

        @Override
        public String toString() {
            return "Sessao{" +
                    "filme='" + filme + '\'' +
                    ", numSala=" + numSala +
                    ", dia=" + dt +
                    ", tipo='" + tipo + '\'' +
                    ", hora=" + hora +
                    ", local='" + local + '\'' +
                    '}';
        }
    }

}
