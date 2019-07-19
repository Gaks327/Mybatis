package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Admin;
import dao.UserDao;
import dao.impl.UserDaoImpl;

public class Test {

	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();
		
		/*List<Admin> admins = dao.findAll();
		for (Admin admin : admins) {
			System.out.println(admin.getPassword());
		}*/
		
		/*Admin admin = dao.selectById(2);
		System.out.println(admin.getId());*/
		
		/*int a = dao.delate();
		System.out.println(a);*/
		
		/*Admin admin = new Admin();
		admin.setId(0);
		admin.setPassword("43");
		admin.setUsername("e");
		int a1=dao.insert(admin);
		System.out.println(a1);*/
		
		Map<String, Object> admin = new HashMap<>();
		admin.put("aa", 0);
		admin.put("bb", "213");
		admin.put("cc", "we");
		int a =  dao.insert1(admin);
		System.out.println(a);
		
		/*List<String> list = new ArrayList<>();
		list.add(null);
		list.add("12");
		list.add("eweww");
		int a = dao.insert2(list);
		System.out.println(a);*/
	}
}
