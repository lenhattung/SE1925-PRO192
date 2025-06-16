/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Circle extends Shape {

    private double r;

    public Circle() {
    }

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }
    
}
