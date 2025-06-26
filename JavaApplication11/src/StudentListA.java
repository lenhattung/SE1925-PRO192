
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class StudentListA {
    private ArrayList<Student> list;

    public StudentListA() {
        list = new ArrayList<>();
    }

    public StudentListA(ArrayList<Student> list) {
        this.list = list;
    }
    
    public void add(Student st){
        this.list.add(st);
    }
    
    public void remove(Student st){
        this.list.remove(st);
    }

    void display() {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
