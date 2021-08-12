package PameShoesShop.Controller.User;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController extends BaseController {

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView Index() {
		
		baseMV.addObject("slides", baseHomeService.getDataSlide());
		baseMV.setViewName("user/index");
		return baseMV;
	}

	@RequestMapping(value = { "/product" }, method = RequestMethod.GET)
	public ModelAndView Product() {
		
		baseMV.setViewName("user/product");
		return baseMV;
	}

}
