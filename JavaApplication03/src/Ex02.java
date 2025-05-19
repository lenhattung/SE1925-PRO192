
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Ex02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao tuoi cua ban:");
        int age = sc.nextInt();
        
        System.out.println("Nhap vao ten cua ban: ");
        sc = new Scanner(System.in); // them dong nay
        String name = sc.nextLine();
        System.out.println(name+"-"+age);
    }
}
