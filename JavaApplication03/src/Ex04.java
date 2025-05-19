
import java.util.Scanner;

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
        double a = 0, b = 0, c = 0, delta, x1, x2;
        Scanner sc = new Scanner(System.in);
        // ax^2 + bx + c =0;
        do {
            System.out.print("Input a <> 0: ");
            try {
                a = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Vui long nhap so!");
                sc = new Scanner(System.in);
            }
        } while (a == 0);
        System.out.print("Input b: ");
        // ...
        try {
            b = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Vui long nhap so!");
            sc = new Scanner(System.in);
        }
        System.out.print("Input c: ");
        //...
        try {
            c = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Vui long nhap so!");
            sc = new Scanner(System.in);
        }

        // Giai phuong trinh bac 2
        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("");
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            //System.out.print("Phuong trinh co nghiem kep x1=x2=" + x1);
            System.out.format("%s=%.2f", "x1=x2", x1);
        } else {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            //System.out.println("x1="+x1);
            //System.out.println("x2="+x2);
            System.out.format("%s=%.2f\n", "x1", x1);
            System.out.format("%s=%.2f\n", "x2", x2);
        }
    }
}
