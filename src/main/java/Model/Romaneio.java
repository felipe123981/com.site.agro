
package Model;

import java.util.Date;


public class Romaneio {
   private int idromaneio;
   private Area area;
   private Alimento alimento;
   private double quantidadetotal;
   private String situacaoromaneiro;
   private double valortotal;
   private double valorliquido;
   private double despesastotal;
   private String notafiscal;
   private Date dataentrada;
   private Parceiro parceiro;

    public int getIdromaneio() {
        return idromaneio;
    }

    public Area getArea() {
        return area;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public double getQuantidadetotal() {
        return quantidadetotal;
    }

    public String getSituacaoromaneiro() {
        return situacaoromaneiro;
    }

    public double getValortotal() {
        return valortotal;
    }

    public double getValorliquido() {
        return valorliquido;
    }

    public double getDespesastotal() {
        return despesastotal;
    }

    public String getNotafiscal() {
        return notafiscal;
    }

    public Date getDataentrada() {
        return dataentrada;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setIdromaneio(int idromaneio) {
        this.idromaneio = idromaneio;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public void setQuantidadetotal(double quantidadetotal) {
        this.quantidadetotal = quantidadetotal;
    }

    public void setSituacaoromaneiro(String situacaoromaneiro) {
        this.situacaoromaneiro = situacaoromaneiro;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public void setValorliquido(double valorliquido) {
        this.valorliquido = valorliquido;
    }

    public void setDespesastotal(double despesastotal) {
        this.despesastotal = despesastotal;
    }

    public void setNotafiscal(String notafiscal) {
        this.notafiscal = notafiscal;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }
}
