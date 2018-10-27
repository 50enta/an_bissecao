package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 50enta
 */
public class Modelo extends AbstractTableModel {
//atributos

    List<Linha> dados = new ArrayList<>();
    String[] coluna = {"#", "a", "b", "p", "F(a)", "F(p)", "F(b)", "(b - a)/2"};

    @Override
    public String getColumnName(int a) {
        return coluna[a];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return coluna.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getLinhaAtual();
            case 1:
                return dados.get(linha).getA();
            case 2:
                return dados.get(linha).getB();
            case 3:
                return dados.get(linha).getP();
            case 4:
                return dados.get(linha).getFa();
            case 5:
                return dados.get(linha).getFp();
            case 6:
                return dados.get(linha).getFb();
            case 7:
                return dados.get(linha).getCondicao();
        }

        return null;
    }

    //método actualizar
    public void adicionarDado(Linha d) {

        dados.add(d);
        this.fireTableDataChanged();

    }

}
