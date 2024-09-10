
package Model;


public class Endereco {
        private int idendereco;
	private String Endereco; 
	private int Numero;
	private String Complemento;
	private  String Cep;
        private String Bairro;
	private String Cidade;
	private String Estado;
	private String Pais;
        private String localizacaogeografica;

    public int getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(int idendereco) {
        this.idendereco = idendereco;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getLocalizacaogeografica() {
        return localizacaogeografica;
    }

    public void setLocalizacaogeografica(String localizacaogeografica) {
        this.localizacaogeografica = localizacaogeografica;
    }

    public Endereco(int idendereco, String Endereco, int Numero, String Complemento, String Cep, String Bairro, String Cidade, String Estado, String Pais, String localizacaogeografica) {
        this.idendereco = idendereco;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.Cep = Cep;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Pais = Pais;
        this.localizacaogeografica = localizacaogeografica;
    }
    
}
