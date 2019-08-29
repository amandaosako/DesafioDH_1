package br.digitalhouse;

public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(String especialidade, String nomeProfessor, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor) {
        this.especialidade = especialidade;
        setNomeProfessor(nomeProfessor);
        setSobrenome(sobrenome);
        setTempoDeCasa(tempoDeCasa);
        setCodigoProfessor(codigoProfessor);

    }

    public ProfessorTitular(String nomeProfessor, String sobrenome, Integer codigoProfessor, String especialidade) {
        this.especialidade = especialidade;
        setNomeProfessor(nomeProfessor);
        setSobrenome(sobrenome);
        setCodigoProfessor(codigoProfessor);
     }

    @Override
    public void ensinar() {

    }

    @Override
    public void corrigirExercicios() {

    }

    @Override
    public void corrigirProvas() {

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
