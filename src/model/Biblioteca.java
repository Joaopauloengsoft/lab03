package model;

public class Biblioteca {
    private String nome;
    private String[] livros;

    public Biblioteca() {
        this.nome = "Biblioteca Desconhecida";
        this.livros = new String[10];
    }

    public Biblioteca(String nome, String l1, String l2, String l3, String l4, String l5, String l6, String l7, String l8, String l9, String l10) {
        this.nome = nome;
        this.livros = new String[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
    }

    public String imprimirLivros() {
        System.out.println(this.nome);
        for (int i = 0; i<this.livros.length; i++){
            System.out.println(this.livros[i]);
        }
        return "";
    }

    public int contarLivrosDisponiveis(){
        int contador = 0;
        for (int i = 0; i<this.livros.length; i++){
            if (livros != null);{
                contador++;
            }
        }
        return contador;
    }

    public boolean verificarDdisponibilidade(String nomeLivro){
        for (int i = 0; i<this.livros.length; i++){
            if (this.livros[i].equals(nomeLivro)){
                return true;
            }
        }
        return false;
    }
}