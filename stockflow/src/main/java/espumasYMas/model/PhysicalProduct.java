package espumasYMas.model;


public class PhysicalProduct extends Product{
    
    private double weight;
    private double shippingCost;
    
    
    public PhysicalProduct(String code, String name, double basePrice, int availableQuantity, boolean active, double weigth, double shippingCost){
        super(code, name, basePrice, availableQuantity, active);
        this.weight = weigth;
        this.shippingCost = shippingCost;
        
    }
    
    @Override
    public void calculateFinalPrice(){
        double finalPrice = 0, surcharge = 0;
        if (weight < 1) {
            return;
        }
        if (getAvaibleQuantity() < 0) {
            return;
        }
         
        if (weight > 10){
            surcharge = weight * 0.08;
        }
        
        finalPrice =  + this.shippingCost + surcharge;
    }
}
