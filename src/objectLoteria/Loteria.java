/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectLoteria;

/**
 *
 * @author nacho
 */
public class Loteria {
    private Integer numero;
    private Integer año;
    
    public Loteria(final Integer año, final Integer numero ){
        setNumero(numero);
        setAño(año);
    }
    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the año
     */
    public Integer getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(Integer año) {
        this.año = año;
    }

    
}

