package model;

public class Turma {
    private String nomeTurma;
    private String[] alunos;

    public Turma() {
        this.nomeTurma = "SemNome";
        this.alunos = new String[5];
    }

    public Turma(String nomeTurma, String a1, String a2, String a3, String a4, String a5) {
        this.nomeTurma = nomeTurma;
        this.alunos = new String[]{a1, a2, a3, a4, a5};
    }
    public String imprimirTurma(){
        System.out.println(this.nomeTurma);
        for (int i = 0; i<this.alunos.length; i++){
            System.out.println(this.alunos[i]);
        }
        return "";
    }

    public int quantidadeAlunos() {
        int alunosCadastrados = 0;
        for (int i = 0; i<this.alunos.length; i++){
            if (alunos != null);{
                alunosCadastrados++;
            }
        }
        return alunosCadastrados;
    }

    public boolean buscarAluno(String nomeAluno){
        for (int i = 0; i<this.alunos.length; i++){
            if (this.alunos[i].equals(nomeAluno)){
                return true;
            }
        }
        return false;
    }
}
