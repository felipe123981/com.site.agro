
package Model;

import java.time.LocalDate;


public class PessoaFisica extends Pessoa{
    private String cpfPf;
    private LocalDate dataAdmissaoPf;
    private LocalDate dataNascimentoPf;
    private String funcaoPf;

    public String getCpfPf() {
        return cpfPf;
    }

    public void setCpfPf(String cpfPf) {
        this.cpfPf = cpfPf;
    }

    public LocalDate getDataAdmissaoPf() {
        return dataAdmissaoPf;
    }

    public void setDataAdmissaoPf(LocalDate dataAdmissaoPf) {
        this.dataAdmissaoPf = dataAdmissaoPf;
    }

    public LocalDate getDataNascimentoPf() {
        return dataNascimentoPf;
    }

    public void setDataNascimentoPf(LocalDate dataNascimentoPf) {
        this.dataNascimentoPf = dataNascimentoPf;
    }

    public String getFuncaoPf() {
        return funcaoPf;
    }

    public void setFuncaoPf(String funcaoPf) {
        this.funcaoPf = funcaoPf;
    }

    public PessoaFisica(String cpfPf, LocalDate dataAdmissaoPf, LocalDate dataNascimentoPf, String funcaoPf, int idpessoa, String nomepessoa, Endereco endereco, String usuariopessoa, String senhapessoa, String nivelpessoa, boolean situacaopessoa, String emailpessoa, String telefonepessoa) {
        super(idpessoa, nomepessoa, endereco, usuariopessoa, 
                senhapessoa, nivelpessoa, situacaopessoa, 
                emailpessoa, telefonepessoa);
        this.cpfPf = cpfPf;
        this.dataAdmissaoPf = dataAdmissaoPf;
        this.dataNascimentoPf = dataNascimentoPf;
        this.funcaoPf = funcaoPf;
    }
    
    
}
