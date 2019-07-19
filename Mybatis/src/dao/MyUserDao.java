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
	//查全部
	public List<Admin> findAll111();
	//查Id
	public Admin selectById111(int id);
	//删
	public int delete111();
	//用类增
	public int insert111(Admin admin);
	//用map集合增
	public int insertmap111(Map<String,Object> map);
	//用list集合增
	public int insertlist111(List<String> list);
	//用resultMap和片段增
	public List<User> findAllAll111();
	//用resultMap一对一增
	public List<User1> select111();
	//用resultMap一对多增
	public List<Role> selectRole111();
	//用resultMap一对一对多增
	public List<User1> selectUser111();
	//用resultMap普通查所有
	public List<SampleInfo> findAll123();
	//批量查询(in) 不实用没有单个查询适用
	public List<SampleInfo> selectinfo123(String[] ids);
	//批量增
	public void	insertall123(List<SampleToxin> list);
	//批量增 回显 方法一
	public void insert123(SampleInfo info);
	//批量增 回显 方法二
	public void insert123456(SampleInfo info);
	
	
	
	
	
	
	
	
	
}

























