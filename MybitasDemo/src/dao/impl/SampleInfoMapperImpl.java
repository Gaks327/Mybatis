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
		/*	session.commit(false);//ǰ��
			session.commit();//��ǿ�к�����ǿ
			session.close();//����
*/		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}

	//һ�����档�����sqlsession��  session �رգ�������� 
	public static void main(String[] args) {
		SampleInfoMapperImpl impl =  new SampleInfoMapperImpl();
		
		SqlSession session = impl.getSession();
		List<SampleInfo> infos = session.selectList("findAll");
		session.selectList("findAll");
		session.close();
		session = impl.getSession();
		session.selectList("findAll");
	}

	@Override	//������
	public List<SampleInfo> findAll(){
		SqlSession session = getSession();
		List<SampleInfo> infos = session.selectList("findAll");
		return infos;
	}
	
	@Override	//������ѯ
	public List<SampleInfo> selectinfo(String[] ids) {
		SqlSession session = getSession();
		List<SampleInfo> infos = session.selectList("selectinfo",ids);
		session.commit();
		return infos;
	}
	@Override	//������
	public void insertall(List<SampleToxin> list) {
		SqlSession session = getSession();
		session.insert("insertall",list);
		session.commit();
		
	}
	@Override	//������ ����
	public void insert(SampleInfo info) {
		SqlSession session = getSession();
		session.insert("insert",info);
		session.commit();
	}
}








































