
package espumasYMas.repository;
import espumasYMas.model.Product;
import java.util.ArrayList;

/**
 *
 * @author cohorte_5
 */
public class RepositoryProduct {
    
    private ArrayList <Product> products;
    
    public RepositoryProduct(){
        this.products = new ArrayList<>();
    }
    
    
    //Methods
    public void save(Product product){
        products.add(product);
    }
    
    public ArrayList<Product> showProducts(){
        return products;
    }
    
    public Product findByCode(String code){
        for (Product product : products) {
            if (product.getCode().equalsIgnoreCase(code)) {
                return product;
            }
        }
        return null;
    }
    
    public boolean existsByCode(String code){
        return findByCode(code) != null;
    }
    
    public boolean deleteByCode(String code){
        Product product = findByCode(code);
        
        if (product == null) {
            return false;
        }
        return products.remove(product);
    }
}
