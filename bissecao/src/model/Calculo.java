/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DecimalDV;
import java.util.ArrayList;

/**
 *
 * @author AN_2018
 */
public class Calculo {

    private ArrayList<Linha> calculos;
    
    public Calculo(){
        this.calculos = new ArrayList<>();
    }

    public void calcular(Linha linha) {
        do {
            //calcularLinha
            //savePoint
            //isFinal
            //decidir
            linha.calcularLinha();
            System.out.println(linha);
            this.getCalculos().add(linha.savePoint());
            if (linha.isFinal()) {
                return;
            } else {
                linha.decidir();
               
            }

        } while (true);
    }

    public ArrayList<Linha> getCalculos() {
        return calculos;
    }

    public void setCalculos(ArrayList<Linha> calculos) {
        this.calculos = calculos;
    }

}
