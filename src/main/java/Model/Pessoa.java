package Model;

public class Pessoa {
    private int idpessoa;
    private String nomepessoa;
    private Endereco endereco;
    private String usuariopessoa;
    private String senhapessoa;
    private String nivelpessoa;
    private boolean situacaopessoa;
    private String emailpessoa;
    private String telefonepessoa;

    public Pessoa(int idpessoa, String nomepessoa, Endereco endereco, String usuariopessoa, 
                  String senhapessoa, String nivelpessoa, boolean situacaopessoa, String emailpessoa,  String telefonepessoa) {
        this.idpessoa = idpessoa;
        this.nomepessoa = nomepessoa;
        this.endereco = endereco;
        this.usuariopessoa = usuariopessoa;
        this.senhapessoa = senhapessoa;
        this.nivelpessoa = nivelpessoa;
        this.situacaopessoa = situacaopessoa;
        this.emailpessoa = emailpessoa;
        this.telefonepessoa= telefonepessoa;
    }

    // Getters e Setters
    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNomepessoa() {
        return nomepessoa;
    }

    public void setNomepessoa(String nomepessoa) {
        this.nomepessoa = nomepessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getUsuariopessoa() {
        return usuariopessoa;
    }

    public void setUsuariopessoa(String usuariopessoa) {
        this.usuariopessoa = usuariopessoa;
    }

    public String getSenhapessoa() {
        return senhapessoa;
    }

    public void setSenhapessoa(String senhapessoa) {
        this.senhapessoa = senhapessoa;
    }

    public String getNivelpessoa() {
        return nivelpessoa;
    }

    public void setNivelpessoa(String nivelpessoa) {
        this.nivelpessoa = nivelpessoa;
    }

    public boolean isSituacaopessoa() {
        return situacaopessoa;
    }

    public void setSituacaopessoa(boolean situacaopessoa) {
        this.situacaopessoa = situacaopessoa;
    }

    /**
     * @return the emailpessoa
     */
    public String getEmailpessoa() {
        return emailpessoa;
    }

    /**
     * @param emailpessoa the emailpessoa to set
     */
    public void setEmailpessoa(String emailpessoa) {
        this.emailpessoa = emailpessoa;
    }

    /**
     * @return the telefonepessoa
     */
    public String getTelefonepessoa() {
        return telefonepessoa;
    }

    /**
     * @param telefonepessoa the telefonepessoa to set
     */
    public void setTelefonepessoa(String telefonepessoa) {
        this.telefonepessoa = telefonepessoa;
    }
}
