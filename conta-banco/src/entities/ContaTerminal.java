package entities;

public class ContaTerminal {

        private int numero ;
        private String agencia ;
        private String nomeCliente;
        private double saldo;



    // construtor

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }




    public int getNumero() {
        return numero;
    }

   
    public void setNumero(int numero) {
        this.numero = numero;
    }

 
    public String getAgencia() {
        return agencia;
    }

   
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public double getSaldo() {
        return saldo;
    }

    public String toString() {

        return "Olá " + 
        getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        getAgencia() + ", conta " +
        getNumero() + " e seu saldo " +
        getSaldo() + "$ já está disponível para saque.";


    }

}
