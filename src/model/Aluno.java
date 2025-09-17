package model;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private double[] nota;

    public Aluno(){
        this.nome ="Desconhecido";
        this.nota = new double[4];
    }

    public Aluno(String nome, double n1, double n2, double n3, double n4) {
        this.nome = nome;
        this.nota = new double[]{n1,n2,n3,n4};
    }

    public void imprimirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Notas:");
        for (int i = 0; i < nota.length; i++) {
            System.out.println(nota[i]);
        }
    }

    public Double calcularMedia(){
        double media = 0;
        for (int i = 0; i < nota.length; i++) {
            media += nota[i];
        }
        return media / nota.length;
    }

    public boolean verificarNotaAprovacao(){
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= 6) {
                return true;
            }
        }
        return false;
    }
}
