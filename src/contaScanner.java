public class contaScanner {
        private String titular ;
        private int nconta  ;
        private  String agencia;
        private double saldo = 500.00;
        private String dataabertura = "04/07/2023";
        private double rendimento ;


        public contaScanner(){

        


        }

        
        public String getTitular() {
            return titular;
        }



        public void setTitular(String titular) {
            this.titular = titular;
        }


        public int getNconta() {
            return nconta;
        }


        public void setNconta(int nconta) {
            this.nconta = nconta;
        }


        public String getAgencia() {
            return agencia;
        }


        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }


        public double getSaldo() {
            return saldo;
        }


        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }


        public String getDataabertura() {
            return dataabertura;
        }


        public void setDataabertura(String dataabertura) {
            this.dataabertura = dataabertura;
        }


        public double getRendimento() {
            return rendimento;
        }


        public void setRendimento(double rendimento) {
            this.rendimento = rendimento;
        }


        public void sacar(double valorSaq) {
            if (saldo >= valorSaq) {
                saldo -=valorSaq;
            }          
            else {System.out.println("Saldo insuficiente");
        }
        }

        public void depositar(double valorDep) {
            saldo +=valorDep;
        }


        public void rend() {
            rendimento = saldo * 0.1;
            saldo = rendimento + saldo;
        }

}
