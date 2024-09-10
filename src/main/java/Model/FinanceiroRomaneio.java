
package Model;

public class FinanceiroRomaneio {
    private int idFinanceiroRomaneio;
    private Romaneio romaneio;
    private Area area;
    private Alimento alimento;
    private Classificacao classificacao;
    private double quantidadeproduzido;
    private double unidadevendabruta;
    private double unidadevendaliquida;
   private DespesasCustos DC; 

    public int getIdFinanceiroRomaneio() {
        return idFinanceiroRomaneio;
    }

    public Romaneio getRomaneio() {
        return romaneio;
    }

    public Area getArea() {
        return area;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public double getQuantidadeproduzido() {
        return quantidadeproduzido;
    }

    public double getUnidadevendabruta() {
        return unidadevendabruta;
    }

    public double getUnidadevendaliquida() {
        return unidadevendaliquida;
    }

    public DespesasCustos getDC() {
        return DC;
    }

    public void setIdFinanceiroRomaneio(int idFinanceiroRomaneio) {
        this.idFinanceiroRomaneio = idFinanceiroRomaneio;
    }

    public void setRomaneio(Romaneio romaneio) {
        this.romaneio = romaneio;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public void setQuantidadeproduzido(double quantidadeproduzido) {
        this.quantidadeproduzido = quantidadeproduzido;
    }

    public void setUnidadevendabruta(double unidadevendabruta) {
        this.unidadevendabruta = unidadevendabruta;
    }

    public void setUnidadevendaliquida(double unidadevendaliquida) {
        this.unidadevendaliquida = unidadevendaliquida;
    }

    public void setDC(DespesasCustos DC) {
        this.DC = DC;
    }
}
