package jugamasoft.dao;

import jugamosoft.dao.ProductDao;
import jugamosoft.domain.Product;

import java.util.List;

/**
 * Created by juandiego on 20/07/15.
 */
public class InMemoryProductDao implements ProductDao {

    private List<Product> productList;

    public InMemoryProductDao(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void saveProduct(Product prod) {
    }

}
