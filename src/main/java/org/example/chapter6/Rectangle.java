package org.example.chapter6;

public class Rectangle {

    private double lenght;
    private double width;

    public Rectangle(){
        lenght = 0;
        width = 0;
    }

    public Rectangle(double lenght, double width){
        this.lenght = lenght;
        setWidth(width);
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght){
        this.lenght = lenght;
    }

    public double getWidth(){
        return width;

    }

    public void setWidth(double width){
        this.width = width;
    }
    public double calculatePerimeter(){
        return (2 * lenght) + (2 * width);
    }

    public double calculateArea(){
        return lenght * width;
    }
}
