/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Matrix {
    private int[][] matrix;
    private int row;

    public Matrix(int row) {
        this.row = row;
        this.matrix = new int[row][row];
    }
    
    public void init(Scanner sc){
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public void print(){
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix sum(Matrix other){
        Matrix tmp = this;
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                tmp.matrix[i][j] += other.matrix[i][j];
            }
        }
        return tmp;
    }
    
}
