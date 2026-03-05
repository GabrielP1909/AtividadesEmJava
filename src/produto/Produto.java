package produto;

public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: preço não pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }
}