/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Matrix {
    private long[][] matrix;
    private int row;
    private int col;

    public Matrix() {
    }

    
    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new long[row][col];
    }
    
    public void init(Scanner sc){
        System.out.print("- Nhập số hàng: ");
        row = Integer.parseInt(sc.nextLine());
        System.out.print("- Nhập số cột: ");
        col = Integer.parseInt(sc.nextLine());
        matrix = new long[row][col];
        System.out.println("- Nhập ma trận: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = Long.parseLong(sc.nextLine());
            }
        }
    }
    public void showMatrix(){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix transposition(){
        Matrix res = new Matrix(col, row);
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                res.matrix[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}
