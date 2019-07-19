package test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bean.Admin;
import bean.Jurisdietion;
import bean.Role;
import bean.SampleInfo;
import bean.SampleToxin;
import bean.User;
import bean.User1;
import dao.MyUserDao;
import dao.UserDao;
import dao.impl.MyUserDaoImpl;
import dao.impl.UserDaoImpl;

public class Mytest {
	
	private static SqlSession getSession() {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			session = factory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	
	public static void main(String[] args) {
		MyUserDao dao = new MyUserDaoImpl();
		
//		查全部
		/*List<Admin> admins = dao.findAll111();
		for (Admin admin : admins) {
			System.out.println(admin.getPassword());
		}*/
		
//		查Id
		/*Admin admin = dao.selectById111(2);
		System.out.println(admin.getId());*/
		
//		删
		/*int a = dao.delete111();
		System.out.println(a);*/
		
//		用类增
		/*Admin admin = new Admin();
		admin.setId(0);
		admin.setPassword("34324");
		admin.setUsername("sdfs");
		int a = dao.insert111(admin);
		System.out.println(a);*/
		
//		用map集合增
		/*Map<String ,Object> map = new HashMap<>();
		map.put("a", 0);
		map.put("b", "3423");
		map.put("c", "tg");
		int a= dao.insertmap111(map);
		System.out.println(a);*/
		
//		用list集合增
		/*List<String> list = new ArrayList<>();
		list.add(null);
		list.add("34");
		list.add("dsf");
		int a= dao.insertlist111(list);
		System.out.println(a);*/
		
//		用resultMap和片段增
		/*List<User> list = dao.findAllAll111();
		for(User user:list) {
			System.out.println(user.getLoginName());
		}*/
		
//		用resultMap一对一增
		/*List<User1> list = dao.select111();
		for (User1 u : list) {
			System.out.println(u.getuRealname()+"*****"+u.getRole().getrName());
		}*/
		
//		用resultMap一对多增
		/*List<Role> list	= dao.selectRole111();
		for (Role role : list) {
			for (Jurisdietion jur : role.getJurisdietions()) {
				System.out.println(role.getrName()+"**********"+jur.getjName());
			}
		}*/
		
//		用resultMap一对一对多增
		/*List<User1> list = dao.selectUser111();
		for (User1 u: list ) {
			System.out.println(u.getuRealname()+"*******"+u.getRole().getrName());
			for (Jurisdietion jur : u.getRole().getJurisdietions()) {
				System.out.println("\t\t"+jur.getjName());
			}
		}*/
		
//	 	七表联查 普通查所有
		/*List<SampleInfo> list = dao.findAll123();
		for (SampleInfo l : list) {
			System.out.println(l.getSampleId());
		}*/
		
//		批量查
		/*String[] ids= {"2","3","4"};
		List<SampleInfo> list = dao.selectinfo123(ids);
		for (SampleInfo l : list) {
			System.out.println(l.getId());
		}*/
		
//		批量增
		/*SampleToxin s = new SampleToxin();
		s.setId(null);
		s.setSampleInfoId(1);
		s.setToxinCount(3f);
		s.setToxinId(3);
		SampleToxin s1 = new SampleToxin();
		s.setId(null);
		s.setSampleInfoId(1);
		s.setToxinCount(3f);
		s.setToxinId(3);
		SampleToxin s2 = new SampleToxin();
		s.setId(null);
		s.setSampleInfoId(1);
		s.setToxinCount(3f);
		s.setToxinId(3);
		SampleToxin s3 = new SampleToxin();
		s.setId(null);
		s.setSampleInfoId(1);
		s.setToxinCount(3f);
		s.setToxinId(3);
		List<SampleToxin> list = new ArrayList<>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		dao.insertall123(list);*/
		
//		增加后 回显
		/*SampleInfo s = new SampleInfo();
		s.setId(null);
		s.setSampleId("s032");
		s.setCropCategoryId(3);
		s.setProvince("370000");
		s.setCity("371400");
		s.setCounty("371428");
		s.setHarvestTime(new Date());
		s.setSamplingTime(new Date());
		s.setSamplingPeople("5");
		s.setPollutionRate(2f);
		s.setCreateTime(new Date());
		s.setIsdel(1);
		s.setInputTime(new Date());
		s.setFlag(2);
		s.setEnterpeople(4);
		dao.insert123456(s);
		System.out.println(s.getId());*/
		
//		分页插询
		/*PageHelper.startPage(3,4);//(参数：1：当前页，2：每页几条)
		List<SampleInfo> list = dao.findAll123();
		//将要分页的集合放置到分页插件中
		PageInfo<SampleInfo> info = new PageInfo<>(list);
		for (SampleInfo s : info.getList()) {
			System.out.println(s);
		}
		System.out.println(info.getEndRow());
		System.out.println(info.getStartRow());
		System.out.println(info.getFirstPage());
		System.out.println(info.getLastPage());
		System.out.println(info.getNextPage());
		System.out.println(info.getPageNum());
		System.out.println(info.getPages());
		System.out.println(info.getSize());*/
		
//		一级缓存	(作用域存在于session中)
		/*SqlSession session = getSession();
		session.selectOne("selectByid123456",1);
		session.selectOne("selectByid123456",1);*/
		
//		二级缓存	(作用域存在于mapper中，即所有的session总和，需要写操作才能刷新缓存，避免脏读 )	
		SqlSession session = getSession();
		session.selectOne("select321", 1);
		SqlSession session1 = getSession();
		session1.update("update",1);
		SqlSession session2 = getSession();
		session2.selectOne("select321", 1);
		
		
		
		
		
		
		
		

		
		
	}
}
















































