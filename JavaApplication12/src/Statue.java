
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        setWeight(weight);
        setColour(colour);
    }
    
    public Statue() {
        super();
    }
    
    // Getter and setter for weight with validation
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight > 0 ? weight : 0;
    }
    
    // Getter and setter for colour with validation
    public String getColour() {
        return colour;
    }
    
    public void setColour(String colour) {
        if (colour != null && !colour.trim().isEmpty()) {
            this.colour = colour.trim();
        }
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===BẮT ĐẦU THÊM TƯỢNG===");
        super.input();
        System.out.print("Nhập cân nặng của tượng: ");
        int weight = Integer.parseInt(sc.nextLine());
        setWeight(weight);
        System.out.print("Nhập màu sắc của tượng: ");
        String colour = sc.nextLine();
        setColour(colour);
    }
    
    @Override
    public String toString() {
        return "(STATUE) " + super.toString() + ", Weight: " + weight + ", Colour: " + colour;
    }
}
