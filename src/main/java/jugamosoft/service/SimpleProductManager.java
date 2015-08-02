package jugamosoft.service;

import jugamosoft.dao.ProductDao;
import jugamosoft.domain.Product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by juandiego on 7/06/15.
 */
@Component
public class SimpleProductManager implements ProductManager {


    @Autowired
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    private List<Product> products;

    private static final long serialVersionUID = 8456265758279050760L;

    public void increasePrice(int percentage) {

        List<Product> products = productDao.getProductList();
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() *
                        (100 + percentage)/100;
                product.setPrice(newPrice);
                productDao.saveProduct(product);
            }
        }
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return productDao.getProductList();
    }
}
