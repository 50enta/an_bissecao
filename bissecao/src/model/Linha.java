package model;

import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;

/**
 * Classe cujo o seu bjecto respresenta cada linha do objecto.
 *
 * @author AN_2018
 */
public class Linha {

    //Atributos
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

    /**
     * Construtor que inicializa o objecto com a função, o erro e os valores do
     * intervalo correspondende
     *
     * @param funcao
     * @param erro
     * @param a
     * @param b
     */
    public Linha(String funcao, double erro, double a, double b) {
        this.setFuncao(funcao);
        this.setErro(erro);
        this.setA(a);
        this.setB(b);
        this.setLinhaAtual(0);
    }

    /**
     * Inicializa apenas com a função
     *
     * @param funcao
     */
    public Linha(String funcao) {
        this.setFuncao(funcao);
    }

    public Linha() {

    }

    /**
     * Calcula todos os valores que constituem cada linha da tabela. Parte do
     * princípio que já tem a função, o erro e os valores de a e b
     */
    public void calcularLinha() {
        this.setP(this.calcularPontoMedio());
        this.setFa(this.calcularFx(this.getA()));
        this.setFb(this.calcularFx(this.getB()));
        this.setFp(this.calcularFx(this.getP()));
        this.setCondicao(this.calcularCondicaoParagem());
        this.setLinhaAtual(this.getLinhaAtual() + 1);
    }

    /**
     * Caso seja para prosseguir, este método determina o novo intervalor, dado
     * as condições.
     */
    public void decidir() {
        if ((this.getFa() < 0 && this.getFp() < 0) || (this.getFa() > 0 && this.getFp() > 0)) {
            this.setA(this.getP());
        } else if ((this.getFb() < 0 && this.getFp() < 0) || (this.getFb() > 0 && this.getFp() > 0)) {
            this.setB(this.getP());
        }
    }

    /**
     * Verifica se já chegou ao final ou não, antes de invocar o método decidir
     *
     * @return
     */
    public boolean isFinal() {
        return this.getCondicao() <= this.getErro();
    }

    /**
     * Salva o atual estado do objecto, para ser listado na tabela
     * posteriormente
     *
     * @return
     */
    public Linha savePoint() {
        Linha li = new Linha();
        li.setLinhaAtual(this.getLinhaAtual());
        li.setA(this.getA());
        li.setB(this.getB());
        li.setP(this.getP());
        li.setCondicao(this.getCondicao());
        li.setFa(this.getFa());
        li.setFb(this.getFb());
        li.setFp(this.getFp());

        return li;
    }

    private double calcularPontoMedio() {
        return (this.getA() + this.getB()) / 2;
    }

    private double calcularCondicaoParagem() {
        return (this.getB() - this.getA()) / 2;
    }

    /**
     * Calcula o valor de x na função.
     *
     * @param x
     * @return
     */
    private double calcularFx(double x) {
        JEP jp = new JEP();
        jp.addStandardConstants();
        jp.addStandardFunctions();
        jp.addVariable("x", x);
        jp.parseExpression(this.funcao);

        if (jp.hasError()) {
//            System.out.println(jp.getErrorInfo());
            JOptionPane.showMessageDialog(null, "Erro na função");
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
