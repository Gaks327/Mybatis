package dao;

import java.util.List;
import java.util.Map;

import bean.Admin;
import bean.Role;
import bean.SampleInfo;
import bean.SampleToxin;
import bean.User;
import bean.User1;

public interface MyUserDao {
	//��ȫ��
	public List<Admin> findAll111();
	//��Id
	public Admin selectById111(int id);
	//ɾ
	public int delete111();
	//������
	public int insert111(Admin admin);
	//��map������
	public int insertmap111(Map<String,Object> map);
	//��list������
	public int insertlist111(List<String> list);
	//��resultMap��Ƭ����
	public List<User> findAllAll111();
	//��resultMapһ��һ��
	public List<User1> select111();
	//��resultMapһ�Զ���
	public List<Role> selectRole111();
	//��resultMapһ��һ�Զ���
	public List<User1> selectUser111();
	//��resultMap��ͨ������
	public List<SampleInfo> findAll123();
	//������ѯ(in) ��ʵ��û�е�����ѯ����
	public List<SampleInfo> selectinfo123(String[] ids);
	//������
	public void	insertall123(List<SampleToxin> list);
	//������ ���� ����һ
	public void insert123(SampleInfo info);
	//������ ���� ������
	public void insert123456(SampleInfo info);
	
	
	
	
	
	
	
	
	
}

























