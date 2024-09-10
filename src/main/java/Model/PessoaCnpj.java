package Model;

public class PessoaCnpj extends Pessoa {

    private String cnpjPessoaCnpj;
    private String razaoSocialPessoaCnpj;
    private String inscricaoEstadualPessoaCnpj;

    public PessoaCnpj(int idpessoa, String nomepessoa, Endereco endereco, String usuariopessoa,
            String senhapessoa, String nivelpessoa, boolean situacaopessoa, String emailpessoa, String telefonepessoa,
            String cnpjPessoaCnpj, String razaoSocialPessoaCnpj, String inscricaoEstadualPessoaCnpj) {
        super(idpessoa, nomepessoa, endereco, usuariopessoa, senhapessoa, nivelpessoa, situacaopessoa, emailpessoa, telefonepessoa);
        this.cnpjPessoaCnpj = cnpjPessoaCnpj;
        this.razaoSocialPessoaCnpj = razaoSocialPessoaCnpj;
        this.inscricaoEstadualPessoaCnpj = inscricaoEstadualPessoaCnpj;
    }



    // Getters e Setters
    public String getCnpjPessoaCnpj() {
        return cnpjPessoaCnpj;
    }

    public void setCnpjPessoaCnpj(String cnpjPessoaCnpj) {
        this.cnpjPessoaCnpj = cnpjPessoaCnpj;
    }

    public String getRazaoSocialPessoaCnpj() {
        return razaoSocialPessoaCnpj;
    }

    public void setRazaoSocialPessoaCnpj(String razaoSocialPessoaCnpj) {
        this.razaoSocialPessoaCnpj = razaoSocialPessoaCnpj;
    }

    public String getInscricaoEstadualPessoaCnpj() {
        return inscricaoEstadualPessoaCnpj;
    }

    public void setInscricaoEstadualPessoaCnpj(String inscricaoEstadualPessoaCnpj) {
        this.inscricaoEstadualPessoaCnpj = inscricaoEstadualPessoaCnpj;
    }
}
