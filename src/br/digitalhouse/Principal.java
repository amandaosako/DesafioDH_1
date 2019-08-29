package br.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        DigitalHouseManager Gerente = new DigitalHouseManager();

        Gerente.registrarProfessorTitular("Mikaella", "Silva", 16, "Inglês");
        Gerente.registrarProfessorTitular("Gabriella", "Egydio", 17, "Espanhol");
        Gerente.registrarProfessorAdjunto("Kesia", "Medeiros", 18 , 5);
        Gerente.registrarProfessorAdjunto("Yolanda", "Ferreti", 19,6);
        Gerente.registrarCurso("Full Stack", 20001, 3);
        Gerente.registrarCurso("Android", 20002, 2);
        Gerente.alocarProfessores(20001, 13, 154);
        Gerente.alocarProfessores(20002, 14, 155);
        Gerente.matricularAluno("Guilherme", "Lofrano", 3546);
        Gerente.matricularAluno("Julia", "Pena", 3547);
        Gerente.matricularAluno("Raphael", "Rowe", 3000);
        Gerente.matricularAluno(500, 20001);
        Gerente.matricularAluno(505, 20001);
        Gerente.matricularAluno(705, 20002);
        Gerente.matricularAluno(706, 20002);
        Gerente.matricularAluno(707, 20002);

    }
}

