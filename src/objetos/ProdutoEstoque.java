package objetos;

public class ProdutoEstoque {
    private int quantidade;
    private String nome;

    public ProdutoEstoque(int quantidade, String nome) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero!");
        }
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome nao pode ser vazio");
        }
        this.quantidade = quantidade;
        this.nome = nome;
    }
    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
            System.out.println("Produto: " + nome + " | Nova quantidade: " + quantidade);
        } else {
            System.out.println("Valor de adicao invalido!");
        }
    }
    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Produto: " + nome + " | Nova quantidade: " + quantidade);
        } else {
            System.out.println("Valor de remocao invalido");
        }
    }
}