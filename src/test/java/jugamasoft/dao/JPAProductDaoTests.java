package jugamasoft.dao;

import jugamosoft.dao.ProductDao;
import jugamosoft.domain.Product;
import org.junit.Assert;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by juandiego on 5/07/15.
 */
public class JPAProductDaoTests {

    private ApplicationContext context;
    private ProductDao productDao;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
        productDao = (ProductDao) context.getBean("productDao");
    }

    @Test
    public void testGetProductList() {
        List<Product> products = productDao.getProductList();
        Assert.assertEquals(products.size(), 3, 0);
    }

    @Test
    public void testSaveProduct() {
        List<Product> products = productDao.getProductList();

        Product p = products.get(0);
        Double price = p.getPrice();
        p.setPrice(200.12);
        productDao.saveProduct(p);

        List<Product> updatedProducts = productDao.getProductList();
        Product p2 = updatedProducts.get(0);
        Assert.assertEquals(p2.getPrice(), 200.12, 0);

        p2.setPrice(price);
        productDao.saveProduct(p2);
    }

}
