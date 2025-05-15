/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Ex06 {

    public static void main(String[] args) {
        int[] a = new int[100];
        int b[] = new int[10];
        int[] d = new int[]{1, 2, 3, 4, 5};
        int c[] = {1, 2, 3, 4, 5};

//        for (int i = 0; i < 100; i++) {
//            System.out.println(a[i]);
//            a[i] = i;
//        }
//        
//        for (int i = 0; i < 100; i++) {
//            System.out.println(a[i]);
//        }
        for (int x : c) {
            System.out.println(x);
            x = 99;
        }

        for (int x : c) {
            System.out.println(x);
        }
    }
}
