/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Rectangle extends Shape{
    private double l, w;

    public Rectangle() {
    }

    public Rectangle(Point p, double l, double w) {
        super(p);
        this.l = l;
        this.w = w;
    }

    @Override
    public double area() {
        return l*w;
    }
    
}
