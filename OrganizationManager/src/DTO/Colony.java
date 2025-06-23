/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author tungi
 */
public class Colony extends Organization {

    protected String place;

    public Colony() {
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }

    public void grow() {
        System.out.println("an annual cycle of growth that begins in\n"
                + "spring");
    }

    public void reproduce() {
        System.out.println("Colony can reproduce itself through\n"
                + "a process");
    }

    @Override
    public String toString() {
        return "the colony size is" + getSize() + ", the colony’s place is " + getPlace();
    }

}
