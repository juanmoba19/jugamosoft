package jugamosoft.service;

import jugamosoft.domain.Product;

import java.io.Serializable;
import java.util.List;

/**
 * Created by juandiego on 7/06/15.
 */
public interface ProductManager extends Serializable{

    void increasePrice(int percentage);

    List<Product> getProducts();

}
