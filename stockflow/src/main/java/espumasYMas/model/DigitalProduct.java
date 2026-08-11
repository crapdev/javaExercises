
package espumasYMas.model;

public class DigitalProduct extends Product{
    
    private double fileSize;
    private String format;
    
    public DigitalProduct(String code, String name, double basePrice, int availableQuantity, boolean active, double fileSize, String format){
        
        super(code, name, basePrice, availableQuantity, active);
        
        this.fileSize = fileSize;
        this.format = format;
    }
    
    //Getters
    public double getfileSize(){
        return fileSize;
    }
    public String getFormat(){
        return format;
    }
    
    //Setters
    public void setFileSize(double fileSize){
        this.fileSize = fileSize;
    }
    public void setFormat(String format){
        this.format = format;
    }
    
    
    //methods
    @Override
    public double calculateFinalPrice() {
        double discount = 0;
        
        if (fileSize > 5) {
            discount = getBasePrice() * 0.05;
        }else {
            discount = getBasePrice() * 0.10;
        }
        
        return getBasePrice() - discount;
        
    }

    @Override
    public String showInformation() {
        return super.showInformation()
                + "\nFile size: " + fileSize + " GB"
                + "\nFormat: " + format;
                
    }
    
    
    
    
    
    
}
