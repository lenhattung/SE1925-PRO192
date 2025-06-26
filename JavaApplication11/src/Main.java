
import java.util.ArrayList;
import java.util.List;

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
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(100);
        
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }
        
        for (Integer value : l1) {
            System.out.println(value);
        }
        
        
        // Test StudentListA
        StudentListA stl = new StudentListA();
        Student st1 = new Student("01", "Nguyen Van A", 8);
        Student st2 = new Student("02", "Hieu Thu Hai", 8.5);
        Student st3 = new Student("03", "Anh Long", 10);
        
//        stl.add(st1);
//        stl.add(st2);
//        stl.add(st3);
//        stl.remove(st3);
//        
//        stl.display();
        // ---
        StudentListB stl2 = new StudentListB();
        stl2.add(st1);
        stl2.add(st2);
        stl2.add(st3);
        stl2.remove(st3);
        stl2.display();
        System.out.println(stl2.contains(st1));
        
    }
}
