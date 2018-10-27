
package view;

import model.Calculo;
import model.Linha;
import org.nfunk.jep.JEP;

/**
 *
 * @author POO_2018
 */
public class Teste {

    public static void main(String[] args) {
        Calculo cal = new Calculo();
        Linha l = new Linha("ln(x) - x + 2", 0.01, 3, 4);
        
        cal.calcular(l);

        System.out.println(cal.getCalculos());

        
    }
    
    
//    public static void main(String[] args) {
//
//        JEP jp = new JEP();
//        jp.addStandardConstants();
//        jp.addStandardFunctions();
//        jp.addVariable("x", 3);
//        jp.parseExpression("cos(1)");
//
//        if (jp.hasError()) {
//            System.out.println(jp.getErrorInfo());
//        } else {
//            System.out.println(jp.getValue());
//        }
//    }

}
