/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.nfunk.jep.JEP;

/**
 *
 * @author POO_2018
 */
public class Teste {

    public static void main(String[] args) {

        JEP jp = new JEP();
        jp.addStandardConstants();
        jp.addStandardFunctions();
        jp.addVariable("x", 3);
        jp.parseExpression("cos(1)");

        if (jp.hasError()) {
            System.out.println(jp.getErrorInfo());
        } else {
            System.out.println(jp.getValue());
        }
    }

}
