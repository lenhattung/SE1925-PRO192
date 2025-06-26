
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class StudentListB extends ArrayList<Student>{
    public StudentListB(){
        
    }
    
    public void display(){
        for (Student st : this) {
            System.out.println(st);
        }
    }
}
