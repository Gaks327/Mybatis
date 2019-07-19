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
		
//		��ȫ��
		/*List<Admin> admins = dao.findAll111();
		for (Admin admin : admins) {
			System.out.println(admin.getPassword());
		}*/
		
//		��Id
		/*Admin admin = dao.selectById111(2);
		System.out.println(admin.getId());*/
		
//		ɾ
		/*int a = dao.delete111();
		System.out.println(a);*/
		
//		������
		/*Admin admin = new Admin();
		admin.setId(0);
		admin.setPassword("34324");
		admin.setUsername("sdfs");
		int a = dao.insert111(admin);
		System.out.println(a);*/
		
//		��map������
		/*Map<String ,Object> map = new HashMap<>();
		map.put("a", 0);
		map.put("b", "3423");
		map.put("c", "tg");
		int a= dao.insertmap111(map);
		System.out.println(a);*/
		
//		��list������
		/*List<String> list = new ArrayList<>();
		list.add(null);
		list.add("34");
		list.add("dsf");
		int a= dao.insertlist111(list);
		System.out.println(a);*/
		
//		��resultMap��Ƭ����
		/*List<User> list = dao.findAllAll111();
		for(User user:list) {
			System.out.println(user.getLoginName());
		}*/
		
//		��resultMapһ��һ��
		/*List<User1> list = dao.select111();
		for (User1 u : list) {
			System.out.println(u.getuRealname()+"*****"+u.getRole().getrName());
		}*/
		
//		��resultMapһ�Զ���
		/*List<Role> list	= dao.selectRole111();
		for (Role role : list) {
			for (Jurisdietion jur : role.getJurisdietions()) {
				System.out.println(role.getrName()+"**********"+jur.getjName());
			}
		}*/
		
//		��resultMapһ��һ�Զ���
		/*List<User1> list = dao.selectUser111();
		for (User1 u: list ) {
			System.out.println(u.getuRealname()+"*******"+u.getRole().getrName());
			for (Jurisdietion jur : u.getRole().getJurisdietions()) {
				System.out.println("\t\t"+jur.getjName());
			}
		}*/
		
//	 	�߱����� ��ͨ������
		/*List<SampleInfo> list = dao.findAll123();
		for (SampleInfo l : list) {
			System.out.println(l.getSampleId());
		}*/
		
//		������
		/*String[] ids= {"2","3","4"};
		List<SampleInfo> list = dao.selectinfo123(ids);
		for (SampleInfo l : list) {
			System.out.println(l.getId());
		}*/
		
//		������
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
		
//		���Ӻ� ����
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
		
//		��ҳ��ѯ
		/*PageHelper.startPage(3,4);//(������1����ǰҳ��2��ÿҳ����)
		List<SampleInfo> list = dao.findAll123();
		//��Ҫ��ҳ�ļ��Ϸ��õ���ҳ�����
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
		
//		һ������	(�����������session��)
		/*SqlSession session = getSession();
		session.selectOne("selectByid123456",1);
		session.selectOne("selectByid123456",1);*/
		
//		��������	(�����������mapper�У������е�session�ܺͣ���Ҫд��������ˢ�»��棬������� )	
		SqlSession session = getSession();
		session.selectOne("select321", 1);
		SqlSession session1 = getSession();
		session1.update("update",1);
		SqlSession session2 = getSession();
		session2.selectOne("select321", 1);
		
		
		
		
		
		
		
		

		
		
	}
}
















































