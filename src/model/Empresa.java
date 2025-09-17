package model;

public class Empresa {
    private String nome;
    private String[] funcionarios;

    public Empresa(){
        this.nome = "Empresa Desconhecida";
        this.funcionarios = new String[8];
    }

    public Empresa(String nome, String f1,String f2, String f3, String f4, String f5, String f6, String f7, String f8) {
        this.nome = nome;
        this.funcionarios = new String[]{f1,f2,f3,f4,f5,f6,f7,f8};
    }

    public String imprimirFuncionarios(){
        System.out.println(this.nome);
        for (int i = 0; i<this.funcionarios.length; i++){
            System.out.println(this.funcionarios[i]);
        }
        return "";
    }

    public int contarFuncionarios(){
        int contador = 0;
        for (int i = 0; i<this.funcionarios.length; i++){
            if (this.funcionarios != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean verificarFuncionario(String nomeFuncionario){
        for (int i = 0; i<this.funcionarios.length; i++){
            if (this.funcionarios[i].equals(nomeFuncionario)){
                return true;
            }
        }
        return false;
    }
}
