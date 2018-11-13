/*
 Clase DTable, crea un JTable para ponerlo en la ventana y cambia sus colores
Autor: Alejandro Gamboa Barahona
09/05/2017
 */
package ProyectoPrograaModelo;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Alejandro
 */
public class DTable extends JTable {
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnIndex ){
        Component component = super.prepareRenderer(renderer,rowIndex , columnIndex);
        component.setBackground(Color.WHITE);
        component.setForeground(Color.BLACK);
        if((Integer.class.equals(this.getColumnClass(columnIndex)))&&(getValueAt(rowIndex, columnIndex)!=null)){
        int val= Integer.parseInt(getValueAt(rowIndex,columnIndex).toString());
        int val2= Integer.parseInt(getValueAt(rowIndex,columnIndex+1).toString());
        if(val>val2){
        component.setBackground(Color.YELLOW);
        component.setForeground(Color.RED);
        }
        }
        return component;
    }
}
