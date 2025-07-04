/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DTO.BeeColony;
import DTO.Colony;
import DTO.FPTUniversity;
import DTO.Role;
import DTO.University;

/**
 *
 * @author tungi
 */
public class Tester {

    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "honey", "land");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();

        University obj2 = new FPTUniversity(100000, "FPT", "Cantho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();

        Role r = new BeeColony(3000, "wasp", "land");
        System.out.println(r);
        r.createWorker();

        r = new FPTUniversity(100000, "FPT", "Hanoi");
        System.out.println(r);
        r.createWorker();
    }
}
