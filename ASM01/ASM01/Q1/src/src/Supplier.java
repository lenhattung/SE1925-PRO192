/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Supplier {
    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    public Supplier() {
    }

    public Supplier(int id,String name, String address, String phone) {
        this.id = id;
        setName(name);
        this.address = address;
        setPhone(phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        if(name!=null && !name.isEmpty() && name.length()>=5 && name.length()<=50){
            this.name = name;
            this.status = true;
        }else{
            this.name = "no name";
            this.status = false;
        }
    }

    public String getAddress() {
        return toTitleCase(address);
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String regex = "^0\\d{8,9}$";
        if(phone.matches(regex)){
            this.phone = phone;
        }else{
            this.phone="000.000.0000";
        }
    }

    public boolean isStatus() {
        return status;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", status=" + status + '}';
    }
    
    
    public String toTitleCase(String value){
        String[] arr = value.split(" ");
        String result = "";
        for (String word : arr) {
            if(word.trim().length()>0){
                String newWord = word.substring(0,1).toUpperCase()+
                                word.substring(1).toLowerCase();
                result+=newWord+" ";
            }
        }
        return result.trim();
    }
}
