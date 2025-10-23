package objetos;

public class ContaBancaria {

	private String titular;
	private Double saldo;

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {

		if (titular != null && titular.isBlank()) {
			this.titular = titular;
		}
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {

		if (saldo >= 0) {
			this.saldo = saldo;
		}
    }
	public ContaBancaria(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("ERRO");
        }
    }
	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("ERRO");
		}
		else if(valor < 0) {
			System.out.println("ERRO");
		}
		else {
			this.saldo -= valor;
		}
	}
	public String toString() {
		return ("Nome: " + this.titular + " Saldo: R$" + this.saldo);
	}
}