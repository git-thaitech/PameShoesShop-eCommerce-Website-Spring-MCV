package PameShoesShop.Controller.User;

import javax.servlet.http.HttpSession;

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
			baseMV.setViewName("/user/account/register");
		} else {
			int resultAddAccount = baseUserService.addANewAccount(user);
			if (resultAddAccount == 1) {
				baseMV.addObject("status", "Your registation is successful!");
				baseMV.setViewName("user/account/login");
			} else {
				baseMV.addObject("status", "FAIL!!!!!");
				baseMV.setViewName("/user/account/register");
			}
		}

		return baseMV;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		baseMV.addObject("user", new Users());
		baseMV.setViewName("user/account/login");
		return baseMV;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView accessAcount(HttpSession session, @ModelAttribute("user") Users user) {
		if(baseUserService.checkAccount(user) != null) {
			Users userSession = baseUserService.checkAccount(user);
			userSession.setPassword(null);
			session.setAttribute("userSession", userSession);
			baseMV.setViewName("user/index");
		} else {
			baseMV.setViewName("user/account/login");
			baseMV.addObject("status", "Your email or password is invalid!");
		}
		return baseMV;
	}
	
	@RequestMapping(value= "/logout", method = RequestMethod.GET)
	public ModelAndView Logout(HttpSession session) {
		session.removeAttribute("userSession");
		baseMV.setViewName("user/index");
		return baseMV;
	}
}
