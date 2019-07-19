package dao.impl;

import java.awt.image.SampleModel;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.SampleInfo;
import bean.SampleToxin;
import dao.SampleInfoMapper;

public class SampleInfoMapperImpl implements SampleInfoMapper {
	private SqlSession getSession() {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			session = factory.openSession();
		/*	session.commit(false);//前置
			session.commit();//增强中后置增强
			session.close();//最终
*/		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}

	//一级缓存。存放在sqlsession中  session 关闭，缓存清空 
	public static void main(String[] args) {
		SampleInfoMapperImpl impl =  new SampleInfoMapperImpl();
		
		SqlSession session = impl.getSession();
		List<SampleInfo> infos = session.selectList("findAll");
		session.selectList("findAll");
		session.close();
		session = impl.getSession();
		session.selectList("findAll");
	}

	@Override	//查所有
	public List<SampleInfo> findAll(){
		SqlSession session = getSession();
		List<SampleInfo> infos = session.selectList("findAll");
		return infos;
	}
	
	@Override	//批量查询
	public List<SampleInfo> selectinfo(String[] ids) {
		SqlSession session = getSession();
		List<SampleInfo> infos = session.selectList("selectinfo",ids);
		session.commit();
		return infos;
	}
	@Override	//批量增
	public void insertall(List<SampleToxin> list) {
		SqlSession session = getSession();
		session.insert("insertall",list);
		session.commit();
		
	}
	@Override	//批量增 回显
	public void insert(SampleInfo info) {
		SqlSession session = getSession();
		session.insert("insert",info);
		session.commit();
	}
}








































