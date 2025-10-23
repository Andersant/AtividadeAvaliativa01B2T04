package objetos;

public class Retangulo {
    private int altura;
    private int base;

    public Retangulo(int altura, int base) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura nao pode ser zero nem negativa");
        }
        if (base <= 0) {
            throw new IllegalArgumentException("A base nao pode ser zero nem negativa");
        }
        this.altura = altura;
        this.base = base;
    }
    public void area() {
        int area = base * altura;
        System.out.println("Area do retangulo:" + area);
    }
    public void perimetro() {
        int perimetro = 2 * (base + altura);
        System.out.println("Perimetro do retangulo:" + perimetro);
    }
    public int getAltura() {
        return altura;
    }
    public int getBase() {
        return base;
    }
}