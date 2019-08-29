package br.digitalhouse;

import java.util.ArrayList;
import java.util.List;

//terminar a lista de alunos

// cadastro de alunos

//descadastrar os alunos

public class Curso {

    private String nomeCurso;
    private Integer codigoCurso;
    private Integer qtdMaximaAlunos;
    private String professorTitular;
    private String professorAdjunto;
    List<Aluno> listaAlunos = new ArrayList<>();

    public Curso(String nomeCurso, Integer codigoCurso, Integer qtdMaximaAlunos, String professorTitular, String professorAdjunto, List<String> alunos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.qtdMaximaAlunos = qtdMaximaAlunos;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
    }


    public Curso(String nomeCurso, Integer codigoCurso, Integer qtdMaximaAlunos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    public Curso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public boolean matricularAluno(Aluno umAluno){
        if (listaAlunos.size() < qtdMaximaAlunos){
            listaAlunos.add(umAluno);
            return true;
        } else {
            return false;
        }
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public Integer getQtdMaximaAlunos() {
        return qtdMaximaAlunos;
    }

    public String getProfessorTitular() {
        return professorTitular;
    }

    public String getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setNomeCurso(String novoNomeCurso) {
        nomeCurso = novoNomeCurso;
    }

    public void setCodigoCurso(Integer novoCodigoCurso) {
        codigoCurso = novoCodigoCurso;
    }

    public void setQtdMaximaAlunos(Integer novoQtdMaximaAlunos) {
        qtdMaximaAlunos = novoQtdMaximaAlunos;
    }

    public void setProfessorTitular(ProfessorTitular novoProfessorTitular) {
        professorTitular = novoProfessorTitular;
    }

    public void setProfessorAdjunto(ProfessorAdjunto novoProfessorAdjunto) {
        professorAdjunto = novoProfessorAdjunto;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        listaAlunos = listaAlunos;
    }

}
