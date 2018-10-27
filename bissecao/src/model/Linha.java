/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.nfunk.jep.JEP;

/**
 *
 * @author 50enta
 */
public class Linha {
//  String[] coluna = {"#", "a", "b", "p", "F(a)", "F(p)", "F(b)", "(b - a)/2"};

    private int linhaAtual;
    private double a;
    private double b;
    private double p;
    private double fa;
    private double fp;
    private double fb;
    private double condicao;

    //Outros
    private String funcao;
    private double erro;
    private double n;

    public Linha(String funcao, double erro, float a, float b) {
        this.setFuncao(funcao);
        this.setErro(erro);
        this.setA(a);
        this.setB(b);
        this.setLinhaAtual(1);
    }

    public Linha() {
    }

    public void calcularLinha() {
        this.setP(this.calcularPontoMedio());
        this.setFa(this.calcularFx(this.getA()));
        this.setFb(this.calcularFx(this.getB()));
        this.setFp(this.calcularFx(this.getP()));
        this.setCondicao(this.calcularCondicaoParagem());
        this.setLinhaAtual(this.getLinhaAtual()+1);
    }

    public void decidir() {
        if ((this.getFa() < 0 && this.getFp() < 0) || (this.getFa() > 0 && this.getFp() > 0)) {
            this.irAEsquerda();

        } else if ((this.getFb() < 0 && this.getFp() < 0) || (this.getFb() > 0 && this.getFp() > 0)) {
            this.irADireita();
        }
    }

    private void irAEsquerda() {
        this.setA(this.getP());
    }

    private void irADireita() {
        this.setB(this.getP());
    }

    public boolean isFinal() {
        return this.getCondicao() <= this.getErro();
    }

    public Linha savePoint() {
        return this;
    }

    private double calcularPontoMedio() {
        return (this.getA() + this.getB()) / 2;
    }

    private double calcularCondicaoParagem() {
        return (this.getB() - this.getA()) / 2;
    }

    private double calcularFx(double x) {
        JEP jp = new JEP();
        jp.addStandardConstants();
        jp.addStandardFunctions();
        jp.addVariable("x", x);
        jp.parseExpression(this.funcao);

        if (jp.hasError()) {
            System.out.println(jp.getErrorInfo());
        }
        return jp.getValue();
    }

    //métodos especiais
    public int getLinhaAtual() {
        return linhaAtual;
    }

    public void setLinhaAtual(int linhaAtual) {
        this.linhaAtual = linhaAtual;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getFa() {
        return fa;
    }

    public void setFa(double fa) {
        this.fa = fa;
    }

    public double getFp() {
        return fp;
    }

    public void setFp(double fp) {
        this.fp = fp;
    }

    public double getFb() {
        return fb;
    }

    public void setFb(double fb) {
        this.fb = fb;
    }

    public double getCondicao() {
        return condicao;
    }

    public void setCondicao(double condicao) {
        this.condicao = condicao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getErro() {
        return erro;
    }

    public void setErro(double erro) {
        this.erro = erro;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Linha{" + "linhaAtual=" + linhaAtual + ", a=" + a + ", b=" + b + ", p=" + p + ", fa=" + fa + ", fp=" + fp + ", fb=" + fb + ", condicao=" + condicao + ", funcao=" + funcao + ", erro=" + erro + ", n=" + n + '}';
    }

}
