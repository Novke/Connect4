package com.novica.connect4.model;

public class Matrix {

    private int[][] fields;

    public Matrix() {
        fields = new int[6][7];
    }

    public int[][] getFields() {
        return fields;
    }

    public void setFields(int[][] fields) {
        this.fields = fields;
    }
    public int getValueAt(int row, int col){
        return fields[row][col];
    }
}
