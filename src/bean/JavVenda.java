/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author u07449294150
 */
public class JavVenda {
    private int javIdVenda;
    private int javIdCliente;
    private int javIdVendedor;
    private Date javDataVenda;
    private Double javValorTotal;
    private String javStatus;
    private Date javDataRegistro;

    /**
     * @return the javIdVenda
     */
    public int getJavIdVenda() {
        return javIdVenda;
    }

    /**
     * @param javIdVenda the javIdVenda to set
     */
    public void setJavIdVenda(int javIdVenda) {
        this.javIdVenda = javIdVenda;
    }

    /**
     * @return the javIdCliente
     */
    public int getJavIdCliente() {
        return javIdCliente;
    }

    /**
     * @param javIdCliente the javIdCliente to set
     */
    public void setJavIdCliente(int javIdCliente) {
        this.javIdCliente = javIdCliente;
    }

    /**
     * @return the javIdVendedor
     */
    public int getJavIdVendedor() {
        return javIdVendedor;
    }

    /**
     * @param javIdVendedor the javIdVendedor to set
     */
    public void setJavIdVendedor(int javIdVendedor) {
        this.javIdVendedor = javIdVendedor;
    }

    /**
     * @return the javDataVenda
     */
    public Date getJavDataVenda() {
        return javDataVenda;
    }

    /**
     * @param javDataVenda the javDataVenda to set
     */
    public void setJavDataVenda(Date javDataVenda) {
        this.javDataVenda = javDataVenda;
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
