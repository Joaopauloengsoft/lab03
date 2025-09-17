package model;

public class Estoque {
    private String produto;
    private int[] quantidades;

    public Estoque() {
        this.produto = "Produto Desconhecido";
        this.quantidades = new int[5];
    }

    public Estoque(String produto, int q1, int q2, int q3, int q4, int q5) {
        this.produto = produto;
        this.quantidades = new int[]{q1, q2, q3, q4, q5};
    }

    public void imprimirEstoque(){
        System.out.println(this.produto);
        for (int i = 0; i<this.quantidades.length; i++){
            System.out.println(this.quantidades[i]);
        }
    }

    public int calcularTotalEstoque(){
        int total = 0;
        for (int i = 0; i<this.quantidades.length; i++){
            total += this.quantidades[i];
        }
        return total;
    }

    public boolean verificaDisponibilidade(int quantidadeMinima){
        for (int i = 0; i<this.quantidades.length; i++){
            if (this.quantidades[i] > quantidadeMinima){
                return true;
            }
        }
        return false;
    }
}
