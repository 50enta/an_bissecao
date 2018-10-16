/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 50enta
 */
public class Linha {
//  String[] coluna = {"#", "a", "b", "p", "F(a)", "F(p)", "F(b)", "(b - a)/2"};

    private int linhaAtual;
    private float a;
    private float b;
    private float p;
    private float fa;
    private float fp;
    private float fb;
    private float condicao;

    public Linha(int linhaAtual, float a, float b, float p, float fa, float fp, float fb, float condicao) {
        this.linhaAtual = linhaAtual;
        this.a = a;
        this.b = b;
        this.p = p;
        this.fa = fa;
        this.fp = fp;
        this.fb = fb;
        this.condicao = condicao;
    }

    public Linha() {
    }

    //métodos especiais
    public int getLinhaAtual() {
        return linhaAtual;
    }

    public void setLinhaAtual(int linhaAtual) {
        this.linhaAtual = linhaAtual;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getFa() {
        return fa;
    }

    public void setFa(float fa) {
        this.fa = fa;
    }

    public float getFp() {
        return fp;
    }

    public void setFp(float fp) {
        this.fp = fp;
    }

    public float getFb() {
        return fb;
    }

    public void setFb(float fb) {
        this.fb = fb;
    }

    public float getCondicao() {
        return condicao;
    }

    public void setCondicao(float condicao) {
        this.condicao = condicao;
    }

}
