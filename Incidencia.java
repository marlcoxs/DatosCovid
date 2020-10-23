/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author marcc
 */
public class Incidencia {
    private String codigo;
    private String fecha;
    private int num_casos;
    private int num_casos_pcr;

    @Override
    public String toString() {
        return "Incidencia{" + "codigo=" + codigo + ", fecha=" + fecha + ", num_casos=" + num_casos + ", num_casos_pcr=" + num_casos_pcr + '}';
    }

    public Incidencia(String codigo, String fecha, int num_casos, int num_casos_pcr) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.num_casos = num_casos;
        this.num_casos_pcr = num_casos_pcr;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNum_casos() {
        return num_casos;
    }

    public void setNum_casos(int num_casos) {
        this.num_casos = num_casos;
    }

    public int getNum_casos_pcr() {
        return num_casos_pcr;
    }

    public void setNum_casos_pcr(int num_casos_pcr) {
        this.num_casos_pcr = num_casos_pcr;
    }

    
}
