package demo1;

public class Conta {
    private int conta;
    private String nome;
    private double saldo;

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void soma(float valorSoma){
        if(this.saldo < valorSoma){
            System.out.println("Operação inválida, saldo disponivel para saque é de, R$ " + saldo);
        }else{
        
    this.saldo -= valorSoma;
        }
    }
    public String imprimeConta(){
    return "Conta: " + this.conta + " - " + this.nome + " - Saldo R$ " + this.saldo;
    }
}
