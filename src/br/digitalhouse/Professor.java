package br.digitalhouse;


public abstract class Professor {

    private String nomeProfessor;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codigoProfessor;

    public Professor() {

    }

    public abstract void ensinar();

    public abstract void corrigirExercicios();

    public abstract void corrigirProvas();

    public Professor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
}
