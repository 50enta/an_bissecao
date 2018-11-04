package model;

import java.util.ArrayList;

/**
 * Classe que representa a tabela inteira, que faz a integração de todas as
 * linhas obtendo assim todo o processo
 *
 * @author AN_2018
 */
public class Calculo {

    private ArrayList<Linha> linhas;

    public Calculo() {
        this.linhas = new ArrayList<>();
    }

    /**
     * É o método que relaciona todos os outros métodos. 
     * Recee um objecto de classe linha, que 
     * @param linha 
     */
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

    /**
     * Retorna a solução, depois do precesso term sido finalizado
     * @return 
     */
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

    /**
     * Retorna o número de ierações necessitadas duarante o cálculo
     * @return 
     */
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
