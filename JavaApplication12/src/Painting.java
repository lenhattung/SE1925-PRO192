
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Painting extends Item {
    private int height, width;
    private boolean isWatercolour, isFramed;
    
    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        setHeight(height);
        setWidth(width);
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    
    public Painting() {
        super();
    }
    
    // Getters and setters with validation
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height > 0 ? height : 0;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width > 0 ? width : 0;
    }
    
    public boolean isWatercolour() {
        return isWatercolour;
    }
    
    public void setWatercolour(boolean watercolour) {
        this.isWatercolour = watercolour;
    }
    
    public boolean isFramed() {
        return isFramed;
    }
    
    public void setFramed(boolean framed) {
        this.isFramed = framed;
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===BẮT ĐẦU THÊM TRANH===");
        super.input();
        
        System.out.print("Nhập chiều cao của tranh: ");
        int height = Integer.parseInt(sc.nextLine());
        setHeight(height);
        
        System.out.print("Nhập chiều rộng của tranh: ");
        int width = Integer.parseInt(sc.nextLine());
        setWidth(width);
        
        // Input for watercolour with validation
        boolean validChoice = false;
        while (!validChoice) {
            System.out.println("Tranh có sử dụng màu nước không?");
            System.out.println("1. Có\n2. Không");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    setWatercolour(true);
                    validChoice = true;
                    break;
                case 2:
                    setWatercolour(false);
                    validChoice = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
                    break;
            }
        }
        
        // Input for framed with validation
        validChoice = false;
        while (!validChoice) {
            System.out.println("Tranh có đóng khung không?");
            System.out.println("1. Có\n2. Không");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    setFramed(true);
                    validChoice = true;
                    break;
                case 2:
                    setFramed(false);
                    validChoice = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
                    break;
            }
        }
    }
    
    @Override
    public String toString() {
        return "(PAINTING) " + super.toString() + ", Height: " + height + ", Width: " + width + 
               ", Có Màu Nước?: " + isWatercolour + ", Có đóng khung?: " + isFramed;
    }
}