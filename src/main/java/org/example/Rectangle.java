package org.example;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea(){
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return height * 2 + width * 2;
    }
}
