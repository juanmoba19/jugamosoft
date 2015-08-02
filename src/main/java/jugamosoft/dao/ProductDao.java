package jugamosoft.dao;

import jugamosoft.domain.Product;

import java.util.List;

/**
 * Created by juandiego on 5/07/15.
 */
public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);
}
