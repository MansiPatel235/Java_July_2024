package sept10_Exception;

public class ProductMain {
    public static void main(String[] args) throws Exception{
        ProductCatalog productCatalog=new ProductCatalog();
        productCatalog.addProductInCart(new Product(1L,"Laptop",35.99,"Electric","2").getProductId());
        productCatalog.addProductInCart(new Product(2L,"Laptop",35.99,"Electric","2").getProductId());
        productCatalog.addProductInCart(new Product(3L,"Laptop",35.99,"Electric","2").getProductId());
        productCatalog.addProductInCart(new Product(4L,"Laptop",35.99,"Electric","2").getProductId());
        try{
            productCatalog.addProductInCart(5L);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
