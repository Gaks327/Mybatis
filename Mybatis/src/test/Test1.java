package test;

import java.util.List;

import bean.Jurisdietion;
import bean.Role;
import bean.User1;
import dao.UserDao;
import dao.UserMapper;
import dao.impl.UserMapperImpl;

public class Test1{

	
	public static void main(String[] args) {
		UserMapper mapper = new UserMapperImpl();
		/*List<User1> list = mapper.select();
		for (User1 user1 : list) {
			System.out.println(user1.getuRealname() +"****"+ user1.getRole().getrName());
		}*/
		/*List<Role> list = mapper.selectRole();
		for (Role role : list) {
			for (Jurisdietion jur : role.getJurisdietions()) {
				System.out.println(role.getrName() +"****"+ jur.getjName());
			}
		}*/
		
		List<User1> user1s = mapper.selectUser();
		for (User1 user1 : user1s) {
			System.out.println(user1.getuRealname()+"****"+ user1.getRole().getrName());
			for (Jurisdietion jur : user1.getRole().getJurisdietions()) {
				System.out.println("\t\t"+ jur.getjName());
			}
		
		}
	}
}
