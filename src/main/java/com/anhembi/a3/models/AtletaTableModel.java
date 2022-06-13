/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhembi.a3.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TheBl
 */
public class AtletaTableModel extends AbstractTableModel{
    
    private ArrayList<Atleta> dados = new ArrayList<>();
    private String[] colunas = {"ID", "Nome", "Nacionalidade", "Altura", "Peso"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex){
            case 0:
                return dados.get(rowIndex).getId();
            
            case 1:
                return dados.get(rowIndex).getNome();

            case 2:
                return dados.get(rowIndex).getNacionalidade();

            case 3:
                return dados.get(rowIndex).getAltura();

            case 4:
                return dados.get(rowIndex).getPeso();
        }
        
        return null;
    }
    
    public void addRow(Atleta a1){
        this.dados.add(a1);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int index){
        this.dados.remove(index);
        this.fireTableRowsDeleted(index, index);
    }
    
    public void deleteAll(){
        this.dados.clear();
        this.fireTableDataChanged();
    }
    
    public ArrayList<Atleta> getAll(){
        return dados;
    }
    
}
