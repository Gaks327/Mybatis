package dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.Role;
import bean.User;
import bean.User1;
import dao.UserMapper;

public class UserMapperImpl implements UserMapper {

	
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
	public List<User1> select() {
		SqlSession session = getSession();
		List<User1>  list=  session.selectList("select");
		return list;
	}


	@Override
	public List<Role> selectRole() {
		SqlSession session = getSession();
		List<Role>  list=  session.selectList("selectRole");
		return list;
	}


	@Override
	public List<User1> selectUser() {
		SqlSession session = getSession();
		List<User1>  list=  session.selectList("selectUser");
		return list;
	}
   
	
}