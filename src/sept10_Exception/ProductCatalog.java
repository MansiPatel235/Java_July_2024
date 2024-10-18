package sept10_Exception;
import java.util.*;

public class ProductCatalog {
    private List<Product>products;

    public ProductCatalog(){
        products=new ArrayList<>();
    }
    private void addProduct(Product product){
        products.add(product);
    }
    public void addProductInCart(Long id) throws Exception{
        Product product = getProductById(id);
        if (product==null){
            throw new ProductNotFoundException("Product is not found");
        }
    }
    private Product getProductById(Long id) {
        for (Product product1 : products) {
            if (Objects.equals(product1.getProductId(), id)) {
                return product1;
            }
        }
        return null;
    }
}
