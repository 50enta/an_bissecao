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

    private ArrayList<Linha> linhas;
    
    public Calculo(){
        this.linhas = new ArrayList<>();
    }

    public void calcular(Linha linha) {
        do {
            linha.calcularLinha();
           // System.out.println(linha); //linah dos testes
            this.getLinhas().add(linha.savePoint());
            if (linha.isFinal()) {
                return;
            } else {
                linha.decidir();
               
            }

        } while (true);
    }

    public ArrayList<Linha> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Linha> linhas) {
        this.linhas = linhas;
    }

}
