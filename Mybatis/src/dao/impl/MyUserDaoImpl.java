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
	
	@Override	//��ȫ��
	public List<Admin> findAll111() {
		SqlSession session = getSession();
		List<Admin> admins = session.selectList("findAll");
		return admins;
	}

	@Override	//��Id
	public Admin selectById111(int id) {
		SqlSession session = getSession();
		Admin admin = session.selectOne("selectById", id);
		return admin;
	}

	@Override	//ɾ
	public int delete111() {
		SqlSession session = getSession();
		int a = session.delete("delete111", 5);
		session.commit();
		return a;
	}

	@Override	//������
	public int insert111(Admin admin) {
		SqlSession session = getSession();
		int a = session.insert("insert111", admin);
		session.commit();
		return a;
	}

	@Override	//��map������
	public int insertmap111(Map<String, Object> map) {
		SqlSession session = getSession();
		int a = session.insert("insertmap111", map);
		session.commit();
		return a;
	}

	@Override	//��list������
	public int insertlist111(List<String> list) {
		SqlSession session = getSession();
		int a = session.insert("insertlist111", list);
		session.commit();
		return a;
	}

	@Override	//��resultMap��Ƭ����
	public List<User> findAllAll111() {
		SqlSession session = getSession();
		List<User> list = session.selectList("findAllAll111");
		return list;
	}

	@Override	//��resultMapһ��һ��
	public List<User1> select111() {
		SqlSession session = getSession();
		List<User1> list = session.selectList("select111");
		return list;
	}

	@Override	//��resultMapһ�Զ���
	public List<Role> selectRole111() {
		SqlSession session = getSession();
		List<Role> list	= session.selectList("selectRole111");
		return list;
	}

	@Override	//��resultMapһ��һ�Զ���
	public List<User1> selectUser111() {
		SqlSession session = getSession();
		List<User1> list = session.selectList("selectUser111");
		return list;
	}

	@Override	//������	
	public List<SampleInfo> findAll123() {
		SqlSession session = getSession();
		List<SampleInfo> list = session.selectList("findAll123");
		return list; 
	}

	@Override	//������ѯ
	public List<SampleInfo> selectinfo123(String[] ids) {
		SqlSession session = getSession();
		List<SampleInfo> list = session.selectList("selectinfo123", ids);
		return list;
	}

	@Override	//������
	public void insertall123(List<SampleToxin> list) {
		SqlSession session = getSession();
		session.insert("insertall123",list);
		session.commit();
	}

	@Override	//������ ���� ����һ
	public void insert123(SampleInfo info) {
		SqlSession session = getSession();
		session.insert("insert123", info);
		session.commit();
	}

	@Override	//������ ���� ������
	public void insert123456(SampleInfo info) {
		SqlSession session = getSession();
		session.insert("insert123456", info);
		session.commit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
