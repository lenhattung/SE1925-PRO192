/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Ex05 {

    public static void main(String[] args) {
        String s = "Truong dai hoc fpt";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // String s = "Truong dai hoc fpt";
        String s1 = s.substring(5);
        System.out.println(s1);

        
        String s2 = s.substring(5, 8);
        System.out.println(s2);
    }
}
