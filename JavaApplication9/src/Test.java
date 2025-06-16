/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Test {

    public static void main(String[] args) {
//        Shape s1 = new Shape();
        Shape s1 = new Dot();
        System.out.println(s1.area());
        
        Shape s2 = new Circle(new Point(50,50), 100);
        System.out.println(s2.area());
        
        Circle c1 = new Circle();
    }
}
