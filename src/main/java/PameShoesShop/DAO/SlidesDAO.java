package PameShoesShop.DAO;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import PameShoesShop.Entity.MapperSlides;
import PameShoesShop.Entity.Slides;

@Repository
public class SlidesDAO extends BaseDAO {

	public List<Slides> getDataSlide() {

		List<Slides> listSlides = new ArrayList<Slides>();

		String sql = "SELECT * FROM slides";
		listSlides = baseJdbcTemplate.query(sql, new MapperSlides());

		return listSlides;
	}

}
