package Test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



import util.SqlSessionUtil;

public class Testcache extends SqlSessionUtil{

	@Test//二级缓存，存储在sqlsession中 需要手动开启
	
	/*<cache eviction="FIFO"  移除缓存中数据的策略
	flushInterval="60000" 自动刷新时间 60s
	size="1024"  	大小
	readOnly="true"/>只读 */
	public void aa() {
		SqlSession session = getsession();
		session.selectOne("selectByid",1);
		closesession();
		SqlSession session1 = getsession();
		session1.selectOne("selectByid",1);
		closesession();
	}
}
