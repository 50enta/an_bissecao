
package model;

import java.util.ArrayList;

/**
 *
 * @author AN_2018
 */
public class Calculo {

    private ArrayList<Linha> linhas;

    public Calculo() {
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
     public double getSolucao() {
        double sol = 0;
        for (Linha a : this.getLinhas()) {
            sol = a.getP();
        }
        return sol;
    }
      public double getP() {
        double sol = 0;
        for (Linha a : this.getLinhas()) {
            sol = a.getP();
            break;
        }
        return sol;
    }

    public int getN() {
        return (int) this.getLinhas().size();
    }

    public ArrayList<Linha> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Linha> linhas) {
        this.linhas = linhas;
    }

   
}
