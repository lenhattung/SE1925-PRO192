/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Audi extends Vehicle {

    private int releasedYear;
    private String color;

    public Audi() {
        super("", "", 0, 0);
        setReleasedYear(0);
        setColor("");
    }

    public Audi(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        setReleasedYear(releasedYear);
        setColor(color);
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        if (releasedYear >= 2022 && releasedYear <= 2025) {
            this.releasedYear = releasedYear;
        } else {
            this.releasedYear = 2022;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Red", "Gray"};
        boolean check = false;
        for (String my_color : colors) {
            if (color.equals(my_color)) {
                check = true;
            }
        }

        if (check) {
            this.color = color;
        } else {
            this.color = "Black";
        }
    }

    @Override
    public double getSubTotal() {
        int x = 100;
        if (this.color.equals("Red") || this.releasedYear == 2025) {
            x = 120;
        }
        return getPrice() * getQuantity() * x / 100;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%.2f,%d,%.2f", getId(), getName(), getColor(), getReleasedYear(), getPrice(), getQuantity(), getSubTotal());
    }

}
