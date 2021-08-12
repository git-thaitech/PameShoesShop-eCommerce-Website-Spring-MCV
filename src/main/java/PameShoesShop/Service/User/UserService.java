package PameShoesShop.Service.User;

import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PameShoesShop.DAO.UsersDAO;
import PameShoesShop.Entity.Users;

@Service
public class UserService {

	@Autowired
	public UsersDAO usersDAO = new UsersDAO();

	public boolean isExistedAccount(String email) {

		List<Users> listUsers = new ArrayList<Users>();
		listUsers = usersDAO.getUsersByEmail(email);

		return (listUsers.size() > 0) ? true : false;
	}

	public int addANewAccount(Users user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(5)));

		return usersDAO.addAnUser(user);
	}

	public Users checkAccount(Users user) {
		List<Users> list = usersDAO.getUsersByEmail(user.getEmail());
		if (list.size() == 0)
			return null;
		else if (BCrypt.checkpw(user.getPassword(), list.get(0).getPassword()))
			return list.get(0);

		return null;
	}

}
