package Entities;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String sigla;
    private String nomeCurso;
    private int numeroDeAlunos;
    Set<Aluno> alunos;

    public Curso(String sigla, String nomeCurso, int numeroDeAlunos) {
        this.sigla = sigla;
        this.nomeCurso = nomeCurso;
        this.numeroDeAlunos = numeroDeAlunos;

        alunos = new HashSet<Aluno>();
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getNumeroDeAlunos() {
        return numeroDeAlunos;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "sigla='" + sigla + '\'' +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", numeroDeAlunos=" + numeroDeAlunos +
                '}';
    }
}
