/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


/**
 *
 * @author 50enta
 */
public class Teste {

    public static void main(String[] args) {
        Jep jep = new Jep();
        try {
            jep.addVariable("x", 10);
            jep.parse("x+1");
            Object result = jep.evaluate();
            System.out.println("x + 1 = " + result);
        } catch (JepException e) {
            System.out.println("An error occurred: " + e.toString());
        }
    }

}
