package Test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



import util.SqlSessionUtil;

public class Testcache extends SqlSessionUtil{

	@Test//�������棬�洢��sqlsession�� ��Ҫ�ֶ�����
	
	/*<cache eviction="FIFO"  �Ƴ����������ݵĲ���
	flushInterval="60000" �Զ�ˢ��ʱ�� 60s
	size="1024"  	��С
	readOnly="true"/>ֻ�� */
	public void aa() {
		SqlSession session = getsession();
		session.selectOne("selectByid",1);
		closesession();
		SqlSession session1 = getsession();
		session1.selectOne("selectByid",1);
		closesession();
	}
}
