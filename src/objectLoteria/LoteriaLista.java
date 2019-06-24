/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectLoteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class LoteriaLista {
    private List<Loteria> loteriaList;
    public LoteriaLista(){
        loteriaList = new ArrayList<Loteria>();
    }
    public void addLoteriaToList(Loteria l_loteria){
        loteriaList.add(l_loteria);
    }
    public Integer readLoteriaAño(final Integer l_año){
        for(Loteria l_loteria: loteriaList){
            if(l_loteria.getAño().equals(l_año)){
                return l_loteria.getNumero();
            }            
        }
        return new Integer(0);
    }
    
    
}
