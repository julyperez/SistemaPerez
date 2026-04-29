/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author u07449294150
 */
public class JavCompra {
    private int javIdCompra;
    private int javIdFornecedor;
    private int javIdUsuario;
    private Date javDataCompra;
    private Double javValorTotal;
    private String javNumeroNota;
    private String javStatus;
    private Date javDataRegistro;

    /**
     * @return the javIdCompra
     */
    public int getJavIdCompra() {
        return javIdCompra;
    }

    /**
     * @param javIdCompra the javIdCompra to set
     */
    public void setJavIdCompra(int javIdCompra) {
        this.javIdCompra = javIdCompra;
    }

    /**
     * @return the javIdFornecedor
     */
    public int getJavIdFornecedor() {
        return javIdFornecedor;
    }

    /**
     * @param javIdFornecedor the javIdFornecedor to set
     */
    public void setJavIdFornecedor(int javIdFornecedor) {
        this.javIdFornecedor = javIdFornecedor;
    }

    /**
     * @return the javIdUsuario
     */
    public int getJavIdUsuario() {
        return javIdUsuario;
    }

    /**
     * @param javIdUsuario the javIdUsuario to set
     */
    public void setJavIdUsuario(int javIdUsuario) {
        this.javIdUsuario = javIdUsuario;
    }

    /**
     * @return the javDataCompra
     */
    public Date getJavDataCompra() {
        return javDataCompra;
    }

    /**
     * @param javDataCompra the javDataCompra to set
     */
    public void setJavDataCompra(Date javDataCompra) {
        this.javDataCompra = javDataCompra;
    }

    /**
     * @return the javValorTotal
     */
    public Double getJavValorTotal() {
        return javValorTotal;
    }

    /**
     * @param javValorTotal the javValorTotal to set
     */
    public void setJavValorTotal(Double javValorTotal) {
        this.javValorTotal = javValorTotal;
    }

    /**
     * @return the javNumeroNota
     */
    public String getJavNumeroNota() {
        return javNumeroNota;
    }

    /**
     * @param javNumeroNota the javNumeroNota to set
     */
    public void setJavNumeroNota(String javNumeroNota) {
        this.javNumeroNota = javNumeroNota;
    }

    /**
     * @return the javStatus
     */
    public String getJavStatus() {
        return javStatus;
    }

    /**
     * @param javStatus the javStatus to set
     */
    public void setJavStatus(String javStatus) {
        this.javStatus = javStatus;
    }

    /**
     * @return the javDataRegistro
     */
    public Date getJavDataRegistro() {
        return javDataRegistro;
    }

    /**
     * @param javDataRegistro the javDataRegistro to set
     */
    public void setJavDataRegistro(Date javDataRegistro) {
        this.javDataRegistro = javDataRegistro;
    }
}
