package br.digitalhouse;

public class ProfessorAdjunto extends Professor {

    private Integer qtdHorasMonitoria;

    public ProfessorAdjunto(Integer qtdHorasMonitoria, String nomeProfessor, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor) {
        this.qtdHorasMonitoria = qtdHorasMonitoria;
        setNomeProfessor(nomeProfessor);
        setSobrenome(sobrenome);
        setTempoDeCasa(tempoDeCasa);
        setCodigoProfessor(codigoProfessor);
    }

    public ProfessorAdjunto(String nomeProfessor, String sobrenome,  Integer codigoProfessor, Integer qtdHorasMonitoria) {
        super();
        this.qtdHorasMonitoria = qtdHorasMonitoria;
        setNomeProfessor(nomeProfessor);
        setSobrenome(sobrenome);
        setCodigoProfessor(codigoProfessor);
        setQtdHorasMonitoria(qtdHorasMonitoria);
    }


    @Override
    public String toString() {
        return "ProfessorAdjunto{" +
                "qtdHorasMonitoria=" + qtdHorasMonitoria +
                '}';
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

    public Integer getQtdHorasMonitoria() {
        return qtdHorasMonitoria;
    }

    public void setQtdHorasMonitoria(Integer qtdHorasMonitoria) {
        this.qtdHorasMonitoria = qtdHorasMonitoria;
    }
}
