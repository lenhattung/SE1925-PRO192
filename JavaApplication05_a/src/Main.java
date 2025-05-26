/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Main {
    public static void main(String[] args) {
        Coffee cf1 = new Coffee("Trung Nguyen", 0.5, 150000);
        System.out.println(cf1.getPrice());
        cf1.setPrice(-15);
        System.out.println(cf1.getPrice());
        cf1.setPrice(100000);
        System.out.println(cf1.getPrice());
    }
}
