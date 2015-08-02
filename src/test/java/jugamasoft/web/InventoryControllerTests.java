package jugamasoft.web;

import jugamasoft.dao.InMemoryProductDao;
import jugamosoft.domain.Product;
import jugamosoft.service.SimpleProductManager;
import jugamosoft.web.InventoryController;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by juandiego on 3/06/15.
 */
public class InventoryControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{
        InventoryController controller = new InventoryController();
        SimpleProductManager spm = new SimpleProductManager();
        spm.setProductDao(new InMemoryProductDao(new ArrayList<Product>()));
        controller.setProductManager(spm);
        //controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);
        Assert.assertEquals("hello", modelAndView.getViewName());
        Assert.assertNotNull(modelAndView.getModel());
        @SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        Assert.assertNotNull(nowValue);
    }
}
