/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02103;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Matrix {
//    private int matrix[][] = new int[][];
    private List < List <Integer> > matrix;
    private int row;
    private int col;
    public Matrix() {
    }
    public Matrix(List < List <Integer> > matrix) {
        this.row = matrix.size();
        this.col = matrix.get(0).size();
        this.matrix = matrix;
    }
    public void init(int row, int col, Scanner sc){
        this.row = row;
        this.col = col;
        this.matrix = new ArrayList < List <Integer> >();
        for(int i=0; i<row; i++){
            List <Integer> tmp = new ArrayList<Integer>();
            for(int j=0; j<col; j++){
                tmp.add(sc.nextInt());
            }
            matrix.add(tmp);
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public List<List<Integer>> getMatrix() {
        return matrix;
    }

    public void setMatrix(List<List<Integer>> matrix) {
        this.matrix = matrix;
    }
    
    public Matrix transpose(){
        List < List <Integer> > res = new ArrayList < List <Integer> >();
        for(int i=0; i<getCol(); i++){
            List <Integer> tmp = new ArrayList<Integer>();
            for(int j=0; j<getRow(); j++){
                tmp.add(matrix.get(j).get(i));
            }
            res.add(tmp);
        }
        return new Matrix(res);
    }
    public Matrix mul(Matrix other){
        List < List <Integer> > res = new ArrayList < List <Integer> >();
        for(int i=0; i<getRow(); i++){
            List <Integer> list = new ArrayList<Integer>();
            for(int j=0; j<other.matrix.get(0).size(); j++){
                int element = 0;
                for(int k=0; k<getCol(); k++){
                    element += this.matrix.get(i).get(k) * other.matrix.get(k).get(j);
                }
                list.add(element);
            }
            res.add(list);
        }
        return new Matrix(res);
    }    
}
