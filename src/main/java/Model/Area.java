
package Model;




public class Area {
    private int idarea;
    private String descricaoarea;
    private Endereco endereco;
    private int quantidadeprodutivo;
    private String siglas;
    private Alimento alimento;

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public String getDescricaoarea() {
        return descricaoarea;
    }

    public void setDescricaoarea(String descricaoarea) {
        this.descricaoarea = descricaoarea;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeprodutivo() {
        return quantidadeprodutivo;
    }

    public void setQuantidadeprodutivo(int quantidadeprodutivo) {
        this.quantidadeprodutivo = quantidadeprodutivo;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public Area(
            int idarea, String descricaoarea, Endereco endereco, 
            int quantidadeprodutivo, String siglas, Alimento alimento) {
        this.idarea = idarea;
        this.descricaoarea = descricaoarea;
        this.endereco = endereco;
        this.quantidadeprodutivo = quantidadeprodutivo;
        this.siglas = siglas;
        this.alimento = alimento;
    }
   
}
