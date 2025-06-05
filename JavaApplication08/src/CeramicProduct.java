/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class CeramicProduct extends Product {

    private String type;

    public CeramicProduct() {
    }

    public CeramicProduct(String type) {
        this.type = type;
    }

    public CeramicProduct(String code, String name, String supplier, double price, String type) {
        super(code, name, supplier, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CeramicProduct{"+"code="+super.getCode()+", name="+super.getName()+", supplier="+super.getSupplier()+", price="+super.getPrice() + ", type=" + type + '}';
    }

    
}
