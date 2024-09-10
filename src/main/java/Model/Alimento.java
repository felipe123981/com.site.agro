
package Model;

public class Alimento {
 private int  idalimento;
 private String Alimento;
 private String Variedade;
 private Classificacao classificacao;

    public int getIdalimento() {
        return idalimento;
    }

    public String getAlimento() {
        return Alimento;
    }

    public String getVariedade() {
        return Variedade;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setIdalimento(int idalimento) {
        this.idalimento = idalimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    public void setVariedade(String Variedade) {
        this.Variedade = Variedade;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
 
}
