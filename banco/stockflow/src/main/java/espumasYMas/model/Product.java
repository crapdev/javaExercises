package espumasYMas.model;


public abstract class Product {
    
    private String code;
    private String name;
    private double basePrice;
    private int availableQuantity;
    private boolean active;
    
    public Product(String code, String name, double basePrice, int availableQuantity, boolean active){
        this.code = code;
        this.name = name;      
        this.basePrice = basePrice;
        this.availableQuantity = availableQuantity;
        this.active = active;
       
    }
    
    
    // Getters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public boolean isActive() {
        return active;
    }
    
    //Setters
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
    //Methods
    
    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", basePrice=" + basePrice + ", availableQuantity=" + availableQuantity + ", active=" + active + '}';
    }

    public abstract double calculateFinalPrice();
    
    public double calculateValueInInventary(){
        
        
        return calculateFinalPrice() * getAvailableQuantity();
    }
    
    
    public String showInformation(){
        String information = "";
        
        
        return "Code: " + code
                + "\nName: " + name
                + "\nBase price: " + basePrice
                + "\nFinal price: " + calculateFinalPrice()
                + "\nAvailable quantity: " + availableQuantity
                + "\nActive: " + active;
    }
    
    
    
    
    // METODO SETTER para nombre (asigna o modifica el valor)
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    // METODO GETTER para nombre (retorna el valor)
//    public String getNombre() {
//        return nombre;
//    }
}
