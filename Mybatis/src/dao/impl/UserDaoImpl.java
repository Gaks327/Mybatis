package dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.Admin;
import dao.UserDao;

public class UserDaoImpl implements UserDao{

	private SqlSession getSession() {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			session = factory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return session;
	}
	@Override
	public List<Admin> findAll() {
		List<Admin> admins = null;
		/*UserDaoImpl.class.getClassLoader().getResourceAsStream("");读取*/
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			SqlSession session = factory.openSession();
			admins = session.selectList("findAll");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admins;
		
	}

	@Override
	public Admin selectById(int id) {
		Admin admin = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			SqlSession session = factory.openSession();
			admin = session.selectOne("selectById", id);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}

	@Override
	public int delate() {
		SqlSession session = getSession();
		int a = session.delete("delate",8);
		session.commit();//增删改需要提交事物
		return a;
	}
	@Override
	public int insert(Admin admin ) {
		SqlSession session = getSession();
		int a = session.insert("insert", admin);
		session.commit();
		return a;
	}
	@Override
	public int insert1(Map<String, Object> admin ) {
		SqlSession session = getSession();
		int a = session.insert("insert1", admin);
		session.commit();
		return a;
	}
	@Override
	public int insert2(List<String> admin) {
		SqlSession session = getSession();
		int a = session.insert("insert2", admin);
		session.commit();
		return a;
	}

}
