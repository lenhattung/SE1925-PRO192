
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tungi
 */
public class FoodProduct extends Product {
    private Date date;
    private Date expriedDate;

    public FoodProduct() {
    }

    public FoodProduct(String code, String name, String supplier, double price, Date date, Date expriedDate) {
        super(code, name, supplier, price);
        this.date = date;
        this.expriedDate = expriedDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getExpriedDate() {
        return expriedDate;
    }

    public void setExpriedDate(Date expriedDate) {
        this.expriedDate = expriedDate;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +"code="+super.getCode()+", name="+super.getName()+", supplier="+super.getSupplier()+", price="+super.getPrice()+ ", date=" + date + ", expriedDate=" + expriedDate + '}';
    }
    

}
