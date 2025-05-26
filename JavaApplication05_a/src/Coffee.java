
public class Coffee {

    // propeties
    private String name;
    private double weight;
    private double price;

    // methods
    // constructor
    public Coffee() {
        this.name = "";
        this.weight = 0;
        this.price = 0;
    }

    public Coffee(String n, double w, double p) {
        this.name = n;
        this.weight = w;
        this.price = p;
    }
    
    public void setName(String name){
        if(name!=null && !name.isEmpty()){
            this.name = name;
        }
    }
    
    public void setPrice(double price){
        if(price>=0){
            this.price = price;
        }
    }
    
    public void setWeight(double weight){
        if(weight>0){
            this.weight = weight;
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public double getWeight(){
        return this.weight;
    }
}
