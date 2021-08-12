package PameShoesShop.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import PameShoesShop.Service.User.HomeServiceIml;
import PameShoesShop.Service.User.UserService;

@Controller
public class BaseController {
	@Autowired
	HomeServiceIml baseHomeService;
	@Autowired
	UserService baseUserService;
	
	public ModelAndView baseMV = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		baseMV.addObject("menu", baseHomeService.getDataSlide());
		return baseMV;
	}

}
