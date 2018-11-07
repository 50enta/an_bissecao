/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Calculo;
import model.Linha;
import model.Modelo;
import static view.Teste.imildo;
import static view.Teste.marco;

/**
 *
 * @author AN_2018
 */
public class Principal extends Frame {

    Modelo modelo = new Modelo();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.tabela.setModel(modelo);
    }

    public boolean validar() {
        if (txtFuncao.getText().trim().equalsIgnoreCase("ex: ln(x) - x + 4")) {
            return false;
        } else if (txtA.getText().trim().equalsIgnoreCase("valor de a")) {
            return false;
        } else if (txtB.getText().trim().equalsIgnoreCase("valor de b")) {
            return false;
        } else if (txtB.getText().trim().equalsIgnoreCase("ex: 0,00003")) {
            return false;
        }
        return true;
    }

    public void limpar() {
        txtFuncao.setText("ex: ln(x) - x + 4");
        txtFuncao.setForeground(new Color(190, 190, 190));
        txtA.setText("valor de a");
        txtA.setForeground(new Color(190, 190, 190));
        txtB.setText("valor de b");
        txtB.setForeground(new Color(190, 190, 190));
        txtErro.setText("ex: 0,00003");
        txtErro.setForeground(new Color(190, 190, 190));
        tabela.setModel(new Modelo());
        lblN.setText("?");
        lblP.setText("?");
        lblRes.setText("0,000000");
        lblResErro.setText("0,000000");
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
        return (int) num + Double.parseDouble(("0." + (int) ((num * mult) % mult)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtErro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblLimpar = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblN = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblResErro = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 650));
        setTitle("Raizes de equação não linear");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 70));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Método da bisseção");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Intervalo: ");

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel2.setText("[");

        txtA.setForeground(new java.awt.Color(190, 190, 190));
        txtA.setText("valor de a");
        txtA.setMinimumSize(new java.awt.Dimension(18, 20));
        txtA.setPreferredSize(new java.awt.Dimension(30, 20));
        txtA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel3.setText(",");

        txtB.setForeground(new java.awt.Color(190, 190, 190));
        txtB.setText("valor de b");
        txtB.setMinimumSize(new java.awt.Dimension(18, 20));
        txtB.setPreferredSize(new java.awt.Dimension(30, 20));
        txtB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel4.setText("]");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("ɛ = ");

        txtErro.setForeground(new java.awt.Color(190, 190, 190));
        txtErro.setText("ex: 0,00003");
        txtErro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtErroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtErroFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("F(x) = ");

        txtFuncao.setForeground(new java.awt.Color(190, 190, 190));
        txtFuncao.setText("ex: ln(x) - x + 4");
        txtFuncao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFuncaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFuncaoFocusLost(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblLimpar.setText("Limpar");
        lblLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(lblLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, 0)
                                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtErro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtErro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(lblLimpar)))
        );

        jPanel4.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída"));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("N = ");

        lblN.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblN.setText("?");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("<html>P <sub>0</sub> = </html>");

        lblP.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblP.setText("?");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Legenda"));

        jLabel12.setText("ɛ ⇒");

        jLabel13.setText("O intervalo onde se encontra a raíz");

        jLabel14.setText("N ⇒");

        jLabel15.setText("P ⇒");

        jLabel16.setText("a e b  ⇒");

        jLabel17.setText("O valor do erro");

        jLabel18.setText("O número máximo de iterações ");

        jLabel19.setText("O ponto médio do intervalo");

        jLabel22.setText("até que (b - a)/2 ≤ ɛ");

        jLabel23.setText("Paragem ⇒");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setText("sol {");

        lblRes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRes.setForeground(new java.awt.Color(255, 0, 102));
        lblRes.setText("0,000000");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel20.setText("}");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel21.setText("±");

        lblResErro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblResErro.setForeground(new java.awt.Color(255, 0, 102));
        lblResErro.setText("0,000000");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11)
                        .addGap(14, 14, 14)
                        .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(20, 20, 20)
                        .addComponent(lblResErro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lblN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblResErro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel7);

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Iterações"));
        jPanel5.setPreferredSize(new java.awt.Dimension(900, 200));
        jPanel5.setLayout(new java.awt.BorderLayout());

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabela.setMaximumSize(new java.awt.Dimension(2147483647, 964));
        tabela.setPreferredSize(new java.awt.Dimension(300, 550));
        jScrollPane1.setViewportView(tabela);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        if (this.validar()) {
            if (Double.parseDouble(txtA.getText()) < Double.parseDouble(txtB.getText())) {
                try {
                    Calculo calc = new Calculo();
                    calc.calcular(new Linha(txtFuncao.getText(), Double.parseDouble(txtErro.getText()), Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText())));
                    this.modelo.setDados(calc.getLinhas());
                    this.tabela.setModel(modelo);
//                this.lblRes.setText(Double.toString(calc.getSolucao()));
                    this.lblRes.setText(Double.toString(marco(calc.getSolucao(), imildo(Double.parseDouble(txtErro.getText())))));
                    this.lblResErro.setText(txtErro.getText());
//                marco(calc.getSolucao(), imildo(Double.parseDouble(txtErro.getText())));
                    this.lblN.setText(Double.toString(calc.getN()));
                    this.lblP.setText(Double.toString(calc.getP()));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Verifique se os campos estão preenchidos corretamente");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Intervalo representado de forma errada!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtFuncaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFuncaoFocusGained
        // TODO add your handling code here:
        String padrao = "ex: ln(x) - x + 4";
        if (txtFuncao.getText().equalsIgnoreCase(padrao)) {
            txtFuncao.setText("");
            txtFuncao.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtFuncaoFocusGained

    private void txtFuncaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFuncaoFocusLost
        String padrao = "ex: ln(x) - x + 4";
        if (txtFuncao.getText().trim().equalsIgnoreCase("")) {
            txtFuncao.setText(padrao);
            txtFuncao.setForeground(new Color(190, 190, 190));
        }
    }//GEN-LAST:event_txtFuncaoFocusLost

    private void txtAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAFocusGained
        // TODO add your handling code here:
        String padrao = "valor de a";
        if (txtA.getText().equalsIgnoreCase(padrao)) {
            txtA.setText("");
            txtA.setForeground(new Color(0, 0, 0));
        }

    }//GEN-LAST:event_txtAFocusGained

    private void txtAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAFocusLost
        // TODO add your handling code here:
        String padrao = "valor de a";
        if (txtA.getText().trim().equalsIgnoreCase("")) {
            txtA.setText(padrao);
            txtA.setForeground(new Color(190, 190, 190));
        }
    }//GEN-LAST:event_txtAFocusLost

    private void txtBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBFocusGained
        // TODO add your handling code here:
        String padrao = "valor de b";
        if (txtB.getText().equalsIgnoreCase(padrao)) {
            txtB.setText("");
            txtB.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBFocusGained


    private void txtBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBFocusLost
        // TODO add your handling code here:
        String padrao = "valor de b";
        if (txtB.getText().trim().equalsIgnoreCase("")) {
            txtB.setText(padrao);
            txtB.setForeground(new Color(190, 190, 190));
        }
    }//GEN-LAST:event_txtBFocusLost

    private void txtErroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtErroFocusGained
        // TODO add your handling code here:
        String padrao = "ex: 0,00003";
        if (txtErro.getText().equalsIgnoreCase(padrao)) {
            txtErro.setText("");
            txtErro.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtErroFocusGained

    private void txtErroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtErroFocusLost
        // TODO add your handling code here:
        String padrao = "ex: 0,00003";
        if (txtErro.getText().trim().equalsIgnoreCase("")) {
            txtErro.setText(padrao);
            txtErro.setForeground(new Color(190, 190, 190));
        }
    }//GEN-LAST:event_txtErroFocusLost

    private void lblLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimparMouseClicked
        // TODO add your handling code here:
        this.limpar();
    }//GEN-LAST:event_lblLimparMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLimpar;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblP;
    private javax.swing.JLabel lblRes;
    private javax.swing.JLabel lblResErro;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtErro;
    private javax.swing.JTextField txtFuncao;
    // End of variables declaration//GEN-END:variables
}
