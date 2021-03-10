import java.lang.Math;

class Fatura {

    int numero;
    String descricao;
    int quantidade;
    double preco;

    Fatura(int numero, String descricao, int quantidade, double preco) {
	this.numero = numero;
	this.descricao = descricao;
	this.quantidade = Math.max(quantidade, 0);
	this.preco = Math.max(preco, 0);
    }

    public void setNumero(int numero) {
	this.numero = numero;
    }

    public int getNumero() {
	return this.numero;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public String getDescricao() {
	return this.descricao;
    }

    public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
    }

    public int getQuantidade() {
	return this.quantidade;
    }

    public void setPreco(double preco) {
	this.preco = preco;
    }

    public double getPreco() {
	return this.preco;
    }

    public double getValorFatura() {
	return this.quantidade * this.preco;
    }
}

class TestaFatura {
} // exercícios mais interessantes, por favor...
