package PameShoesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategoriesMapper implements RowMapper<Categories> {
	
	public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categories category = new Categories();
		category.setCategoryId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		category.setNumberOfProduct(rs.getInt("numberOfProduct"));
		
		return category;
	}

}
