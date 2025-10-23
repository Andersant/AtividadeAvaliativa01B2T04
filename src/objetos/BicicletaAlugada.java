package objetos;

public class BicicletaAlugada {
	private int horas;
	private double valorHora;

	public BicicletaAlugada(int horas, double valorHora) {
		setHoras(horas);
		setValorHora(valorHora);
	}
	public double calcularValor() {
		return this.horas * this.valorHora;
	}
	public void exibirValorFinal() {
		System.out.printf("Horas alugadas: %d \n Valor por hora: %.2f reais\nValor total: %.2f reais\n", this.horas, this.valorHora, calcularValor());
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		if (horas >= 1) this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		if (valorHora > 0) this.valorHora = valorHora;
	}
}