package br.digitalhouse;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codigoAluno;


    public Aluno (String nome, String sobrenome, Integer codigoAluno){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;

    }


    public Aluno(Integer codigoAluno, Curso codigoCurso) {

    }

    public Aluno(Aluno codigoAluno, Curso codigoCurso) {

    }

    private String estudar() {
        return "O aluno estudou";
    }

    private String fazerExercicios (){
        return "O aluno fez os exercícios";
    }

    private String fazerProvas (){
        return "O aluno fez a prova";
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setSobrenome(String novoSobrenome) {
        sobrenome = novoSobrenome;
    }

    public void setCodigoAluno(Integer novoCodigoAluno) {
        codigoAluno = novoCodigoAluno;
    }




}
