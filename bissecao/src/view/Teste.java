package view;

import model.Calculo;
import model.Linha;

/**
 *
 * @author AN_2018
 */
public class Teste {

    public static void main(String[] args) {

        System.out.println(marco(8.789584, imildo(0.76)));

    }

    public static int imildo(double num) {
        return Double.toString(num).split("\\.")[1].length();
    }

    public static double marco(double num, int n) {
        String ini = "1";
        for (int i = 0; i < n; i++) {
            ini += "0";
        }
        int mult = Integer.parseInt(ini);
        return (int) num + Double.parseDouble(( "0." +(int) ((num * mult) % mult)));
    }
}
