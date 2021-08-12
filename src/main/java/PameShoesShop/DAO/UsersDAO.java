package PameShoesShop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import PameShoesShop.Entity.MapperUsers;
import PameShoesShop.Entity.Users;

@Repository
public class UsersDAO extends BaseDAO {

	public List<Users> getUsers() {
		List<Users> listUsers = new ArrayList<Users>();

		String sql = "SELECT * FROM users";
		listUsers = baseJdbcTemplate.query(sql, new MapperUsers());

		return listUsers;
	}

	public List<Users> getUsersByEmail(String email) {
		List<Users> listUsers = new ArrayList<Users>();

		String sql = "SELECT * FROM users WHERE email='" + email + "'";
		listUsers = baseJdbcTemplate.query(sql, new MapperUsers());

		return listUsers;
	}

	public int addAnUser(Users users) {

		String sql = "INSERT INTO users(firstName, lastName, email, password, phoneNumber, address, role) VALUES ("
				+ "\'" + users.getFirstName() + "\',\'" + users.getLastName() + "\',\'" + users.getEmail() + "\',\'" + users.getPassword()
				+ "\',\'" + users.getPhone() + "\',\'" + users.getAddress() + "\'," + "2" + ");";
		
		return baseJdbcTemplate.update(sql);

	}
}
