package dao;

import java.awt.image.SampleModel;
import java.util.List;

import bean.SampleInfo;
import bean.SampleToxin;

public interface SampleInfoMapper {
    
	public List<SampleInfo> findAll();
	
	public List<SampleInfo> selectinfo(String[] ids);
	
	public void insertall(List<SampleToxin> list);
	
	public void insert(SampleInfo info);
}