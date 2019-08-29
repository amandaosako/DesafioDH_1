package br.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    List<Aluno> listaAlunos = new ArrayList<>();
    List<Curso> listaCursos = new ArrayList<>();
    List<Professor> listaProfessores = new ArrayList<>();
    List<Matricula> listaMatriculas = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {

        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaCursos.add(curso);

    }

    public void excluirCurso(Integer codigoCurso) {

        Curso curso = new Curso(codigoCurso);
        listaCursos.add(curso);
    }

    public void registrarProfessorAdjunto(String nomeProfessor, String sobrenome, Integer codigoProfessor, Integer qtdHorasMonitoria) {

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nomeProfessor, sobrenome, codigoProfessor, qtdHorasMonitoria);
        listaProfessores.add(professorAdjunto);
    }

    public void registrarProfessorTitular(String nomeProfessor, String sobrenome, Integer codigoProfessor, String especialidade) {

        ProfessorTitular professorTitular = new ProfessorTitular(nomeProfessor, sobrenome, codigoProfessor, especialidade);
        listaProfessores.add(professorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {

        listaProfessores.remove(codigoProfessor);

    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {

        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaAlunos.add(aluno);

    }

    public void matricularAluno(int codigoAluno, int codigoCurso) {

        Aluno aluno = new Aluno(codigoAluno, codigoCurso);
        listaAlunos.add(aluno);

        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getCodigoCurso().equals(codigoCurso)) {
                codigoCurso = listaCursos.get(i);
                break;
            }
        }

        if (codigoCurso == null) {
            System.out.println("O curso não foi encontrato!");
        }

        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getCodigoAluno().equals(codigoAluno)) {
                codigoAluno = listaAlunos.get(i);
                break;
            }

            if (codigoAluno == null) {
                System.out.println("O aluno não foi encontrado!");

            }
            if (codigoCurso.matricularAluno(codigoAluno)) {
                System.out.println("Matrícula realizada com sucesso!");
            } else {
                System.out.println("Infelizmente não foi possível realizar sua matrícula, não há vagas");
            }

        }

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        Professor professorTitularAlocado = null;
        Professor professorAdjuntoAlocado = null;
        Curso cursoAlocado = null;

        for (int i = 0; i < listaProfessores.size(); i++) {
            if (listaProfessores.get(i).getCodigoProfessor().equals(codigoProfessorTitular)) {
                professorTitularAlocado = listaProfessores.get(i);
            }
            if (listaProfessores.get(i).getCodigoProfessor().equals(codigoProfessorAdjunto)) {
                professorAdjuntoAlocado = listaProfessores.get(i);
            }
            if (professorTitularAlocado != null && professorAdjuntoAlocado != null) {
                break;
            }

        }
        if (professorTitularAlocado == null) {
            System.out.println(" O professor titular não foi encontrado!");
            return;
        }
        if (professorAdjuntoAlocado == null) {
            System.out.println("O professor adjunto não foi encontrado!");
            return;
        }

        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getCodigoCurso().equals(codigoCurso)) {
                cursoAlocado = listaCursos.get(i);
                break;
            }
        }
        if (cursoAlocado == null) {
            System.out.println("O curso não foi encontrado!");
            return;
        }
        cursoAlocado.setProfessorTitular((ProfessorTitular) professorTitularAlocado);
        cursoAlocado.setProfessorAdjunto((ProfessorAdjunto) professorAdjuntoAlocado);
    }
}


