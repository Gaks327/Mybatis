package test;

import java.util.List;

import bean.User;
import dao.UserDao2;
import dao.impl.UserDaoImpl2;

public class UserTest {

	public static void main(String[] args) {
		UserDao2 dao2 = new UserDaoImpl2();
		List<User> list = dao2.findAll();
		for (User user : list) {
			System.out.println(user.getLoginName());
		}
	}
}













