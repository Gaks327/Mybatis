package util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionUtil {
	private ThreadLocal<SqlSession> th=new ThreadLocal<SqlSession>();
	private  static SqlSessionFactory sf=null;
	static{
		try {
			Reader r=Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
			sf=sfb.build(r);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//´ò¿ªsession
	protected SqlSession getsession(){
		 SqlSession session=th.get();
		 if(session==null){
			 session=sf.openSession();
			 th.set(session);
		 }
		 return session;
	}
	//¹Ø±Õsession
	protected void closesession(){
		 SqlSession session=th.get();
		 if(session!=null){
			 session.close();
			 th.set(null);
		 }
	}
	
	
}
