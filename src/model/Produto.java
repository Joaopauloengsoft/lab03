package model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
        this.nome = "";
        this.preco = 0;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValoEstoque() {
        return quantidade * preco;
    }
    public int adicionarEstoque(int addEstoque) {
        this.quantidade += addEstoque;
        return this.quantidade;
    }
}
