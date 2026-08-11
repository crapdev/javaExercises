package espumasYMas.model;


public class PhysicalProduct extends Product{
    
    private double weight;
    private double shippingCost;
    
    
    public PhysicalProduct(String code, String name, double basePrice, int availableQuantity, boolean active, double weigth, double shippingCost){
        super(code, name, basePrice, availableQuantity, active);
        this.weight = weigth;
        this.shippingCost = shippingCost;
        
    }
    
    //Getters
    public double getWeight() {
        return weight;
    }
    public double getShippingCost() {
        return shippingCost;
    }
    
    //Setters
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
    
    
    //methods
    @Override
    public double calculateFinalPrice(){
        double  surcharge = 0;
        
        if (weight > 10){
            surcharge = getBasePrice() * 0.08;
        }
        
        return getBasePrice() + shippingCost + surcharge;
    }
    
    @Override
    public String showInformation() {

        return super.showInformation()
                + "\nWeight: " + weight + " kg"
                + "\nShipping cost: " + shippingCost;
    }
    
}
