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
    public String getName(){
        return this.name;
    }
    public int getAvaibleQuantity(){
        return this.availableQuantity;
    }
    // Setters
    public void setName(String name){
        this.name = name;
    }
    
    //Methods
    public abstract void calculateFinalPrice();
    
    public String showInformation(){
        String information = "";
        
        
        return information ;
    }
    
    public double calculateValueInInventary(double finalPrice, int avaibleQuantity){
        
        double inventoryPrice = finalPrice * avaibleQuantity;
        
        return inventoryPrice;
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
