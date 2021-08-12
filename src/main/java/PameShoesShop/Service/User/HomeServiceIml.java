package PameShoesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PameShoesShop.DAO.SlidesDAO;
import PameShoesShop.Entity.Slides;

@Service
public class HomeServiceIml implements IHome {

	@Autowired
	public SlidesDAO slideDao = new SlidesDAO();

	public List<Slides> getDataSlide() {
		return slideDao.getDataSlide();
	}

}
