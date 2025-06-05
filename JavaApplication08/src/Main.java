
import java.util.Date;
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
        Product p1 = new Product("C001", "Product 1", "FPT", 50000);
        System.out.println(p1);
        
        FoodProduct fp1 = new FoodProduct("C002", "Hao Hao", "Acecook", 4000, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()+30*24*60*60*1000));
        System.out.println(fp1);
        
        CeramicProduct cp1 = new CeramicProduct("C003", "Bo am chen ML1", "Minh Long", 200000, "Am Chen");
        System.out.println(cp1);
    }
}
