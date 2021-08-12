package PameShoesShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import PameShoesShop.Entity.Users;

@Controller
public class UserController extends BaseController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		baseMV.addObject("user", new Users());
		baseMV.setViewName("user/account/register");
		return baseMV;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute("user") Users user) {

		if (baseUserService.isExistedAccount(user.getEmail())) {
			baseMV.addObject("status", "The email have been used, please try another email!");
		} else {
			int resultAddAccount = baseUserService.addANewAccount(user);
			if (resultAddAccount == 1) {
				baseMV.addObject("status", "Your registation is successful!");
			} else {
				baseMV.addObject("status", "FAIL!!!!!");
			}
		}
		baseMV.setViewName("/user/account/register");

		return baseMV;
	}

}
