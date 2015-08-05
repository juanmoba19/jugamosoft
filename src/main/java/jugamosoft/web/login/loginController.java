package jugamosoft.web.login;

import jugamosoft.service.PriceIncrease;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by juandiego on 1/08/15.
 */
@Controller
public class loginController {

    @RequestMapping(value="/login/login.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){

        Map<String,Object> myModel = new HashMap<String, Object>();

        return new ModelAndView();
    }


}
