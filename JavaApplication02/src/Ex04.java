/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Ex04 {

    public static void main(String[] args) {
        int x = 15;
        x = x >> 2;
        System.out.println(x);

        x = x << 2;
        System.out.println(x);

        x = -1;
        System.out.println("-1<<1: " + (x << 1));
        System.out.println(x);
        System.out.println("-1>>1: " + (x >> 1));
        // System.out.println("-1>>>1: " + (x >>> 1));

        int a = 10;
        int b = 7;
        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a | b);
    }
}
