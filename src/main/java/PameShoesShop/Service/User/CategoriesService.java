package PameShoesShop.Service.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PameShoesShop.DAO.CategoriesDAO;
import PameShoesShop.Entity.Categories;

@Service
public class CategoriesService {
	@Autowired
	public CategoriesDAO categoriesDAO;
	
	public List<String> getAllName() {
		List<String> list = new ArrayList<String>();
		List<Categories> listCategories = categoriesDAO.getAll();
		
		for (Categories cate: listCategories) {
			list.add(cate.getName());
		}
		return list;
	}

}
