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
import bean.Role;
import bean.SampleInfo;
import bean.SampleToxin;
import bean.User;
import bean.User1;
import dao.MyUserDao;

public class MyUserDaoImpl implements MyUserDao {

	private SqlSession getSession() {
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
	
	@Override	//查全部
	public List<Admin> findAll111() {
		SqlSession session = getSession();
		List<Admin> admins = session.selectList("findAll");
		return admins;
	}

	@Override	//查Id
	public Admin selectById111(int id) {
		SqlSession session = getSession();
		Admin admin = session.selectOne("selectById", id);
		return admin;
	}

	@Override	//删
	public int delete111() {
		SqlSession session = getSession();
		int a = session.delete("delete111", 5);
		session.commit();
		return a;
	}

	@Override	//用类增
	public int insert111(Admin admin) {
		SqlSession session = getSession();
		int a = session.insert("insert111", admin);
		session.commit();
		return a;
	}

	@Override	//用map集合增
	public int insertmap111(Map<String, Object> map) {
		SqlSession session = getSession();
		int a = session.insert("insertmap111", map);
		session.commit();
		return a;
	}

	@Override	//用list集合增
	public int insertlist111(List<String> list) {
		SqlSession session = getSession();
		int a = session.insert("insertlist111", list);
		session.commit();
		return a;
	}

	@Override	//用resultMap和片段增
	public List<User> findAllAll111() {
		SqlSession session = getSession();
		List<User> list = session.selectList("findAllAll111");
		return list;
	}

	@Override	//用resultMap一对一增
	public List<User1> select111() {
		SqlSession session = getSession();
		List<User1> list = session.selectList("select111");
		return list;
	}

	@Override	//用resultMap一对多增
	public List<Role> selectRole111() {
		SqlSession session = getSession();
		List<Role> list	= session.selectList("selectRole111");
		return list;
	}

	@Override	//用resultMap一对一对多增
	public List<User1> selectUser111() {
		SqlSession session = getSession();
		List<User1> list = session.selectList("selectUser111");
		return list;
	}

	@Override	//查所有	
	public List<SampleInfo> findAll123() {
		SqlSession session = getSession();
		List<SampleInfo> list = session.selectList("findAll123");
		return list; 
	}

	@Override	//批量查询
	public List<SampleInfo> selectinfo123(String[] ids) {
		SqlSession session = getSession();
		List<SampleInfo> list = session.selectList("selectinfo123", ids);
		return list;
	}

	@Override	//批量增
	public void insertall123(List<SampleToxin> list) {
		SqlSession session = getSession();
		session.insert("insertall123",list);
		session.commit();
	}

	@Override	//批量增 回显 方法一
	public void insert123(SampleInfo info) {
		SqlSession session = getSession();
		session.insert("insert123", info);
		session.commit();
	}

	@Override	//批量增 回显 方法二
	public void insert123456(SampleInfo info) {
		SqlSession session = getSession();
		session.insert("insert123456", info);
		session.commit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
