package br.digitalhouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataDeMatricula;

    public Matricula(Aluno aluno, Curso curso, Date dataDeMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDeMatricula = dataDeMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }
}
