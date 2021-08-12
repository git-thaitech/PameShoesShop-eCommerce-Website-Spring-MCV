package PameShoesShop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import PameShoesShop.Entity.Categories;
import PameShoesShop.Entity.CategoriesMapper;

@Repository
public class CategoriesDAO extends BaseDAO{

	public List<Categories> getAll() {
		List<Categories> list = new ArrayList<Categories>();
		
		String sql = "SELECT * FROM categories";
		list = baseJdbcTemplate.query(sql, new CategoriesMapper());

		return list;
	}
}
