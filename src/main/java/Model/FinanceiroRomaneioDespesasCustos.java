
package Model;


public class FinanceiroRomaneioDespesasCustos {
    private FinanceiroRomaneio fromaneio;
    private int idFinanceiroRomaneioDespesasCustos;
    private DespesasCustos dc;
    private double valordespesas;
	public FinanceiroRomaneio getFromaneio() {
		return fromaneio;
	}
	public void setFromaneio(FinanceiroRomaneio fromaneio) {
		this.fromaneio = fromaneio;
	}
	public int getIdFinanceiroRomaneioDespesasCustos() {
		return idFinanceiroRomaneioDespesasCustos;
	}
	public void setIdFinanceiroRomaneioDespesasCustos(int idFinanceiroRomaneioDespesasCustos) {
		this.idFinanceiroRomaneioDespesasCustos = idFinanceiroRomaneioDespesasCustos;
	}
	public DespesasCustos getDc() {
		return dc;
	}
	public void setDc(DespesasCustos dc) {
		this.dc = dc;
	}
	public double getValordespesas() {
		return valordespesas;
	}
	public void setValordespesas(double valordespesas) {
		this.valordespesas = valordespesas;
	}


}
