package objetos;

public class Pessoa {
	
	private String nome;
	private double peso;
	private double altura;

	public Pessoa () {}

	public Pessoa(String nome, double peso, double altura) {
		setNome (nome);
		setPeso  (peso);
		setAltura (altura);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso >0) {
			this.peso = peso;
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura >0) {
			this.altura = altura;
		}
	}

	public double calcularIMC() {
		double imc= peso / (altura * altura);
		return imc;
	}

	public String classificacaoIMC() {
		double imc= peso / (altura * altura);

		if (imc < 18.5 ) {
			return "Abaixo do peso";
		}
		else if (imc > 18.5 && imc < 24.9 ) {
			return "Peso normal";
		}
		else if (imc > 25.0 && imc < 29.9 ) {
			return "Sobrepeso";
		}
		else if (imc > 30.0 && imc < 34.9 ) {
			return "Obesidade grau 1";
		}
		else if (imc > 35.0 && imc < 39.9 ) {
			return "Obesidade grau 2";
		}
		else if (imc > 40.0 ) {
			return "Obesidade grau 3";
		}
		return "Valor de IMC invalido";

	}

}