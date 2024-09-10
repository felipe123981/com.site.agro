
package Model;


public class Parceiro extends PessoaCnpj {

    public String getSiteparceiro() {
        return siteparceiro;
    }

    public void setSiteparceiro(String siteparceiro) {
        this.siteparceiro = siteparceiro;
    }
  private String siteparceiro;

    public Parceiro(int idpessoa, String nomepessoa, Endereco endereco, String usuariopessoa, String senhapessoa, 
            String nivelpessoa, boolean situacaopessoa, String emailpessoa, String telefonepessoa, String cnpjPessoaCnpj, 
            String razaoSocialPessoaCnpj, String inscricaoEstadualPessoaCnpj, String siteparceiro) {
        super(idpessoa, nomepessoa, endereco, usuariopessoa, senhapessoa, nivelpessoa, situacaopessoa, 
                emailpessoa, telefonepessoa, cnpjPessoaCnpj, razaoSocialPessoaCnpj, inscricaoEstadualPessoaCnpj);
        this.siteparceiro= siteparceiro;
    }

}
