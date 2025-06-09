/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Vehicle {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Vehicle() {
        setId("");
        setName("");
        setPrice(0);
        setQuantity(0);
    }

    public Vehicle(String id, String name, double price, int quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getId() {
        return toTitleCase(id);
    }

    public void setId(String id) {
        String regex = "^[Vv]\\d{6}$";
        if (id != null && id.matches(regex)) {
            this.id = id;
        } else {
            this.id = "V000000";
        }
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        if (name != null && name.length() >= 5 && name.length() <= 50) {
            this.name = name;
        } else {
            this.name = "new vehicle";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 1 && price <= 1000000) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 1 && quantity <= 1000) {
            this.quantity = quantity;
        } else {
            this.quantity = 1;
        }
    }

    public String toTitleCase(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (String word : words) {
            word = word.trim();
            if (!word.isEmpty()) {
                String newWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result += newWord + " ";
            }
        }
        return result.trim();
    }

    public double getSubTotal() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%.2f,%d,%.2f", getId(), getName(), getPrice(), getQuantity(), getSubTotal());
    }
}
