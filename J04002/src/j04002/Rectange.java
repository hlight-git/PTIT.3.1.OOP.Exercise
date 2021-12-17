/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j04002;

/**
 *
 * @author ADMIN
 */
public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        width = 1;
        height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return width*height;
    }
    
    public double findPerimeter(){
        return 2*(width+height);
    }
}
