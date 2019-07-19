package Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.SampleInfo;
import bean.SampleToxin;
import dao.SampleInfoMapper;
import dao.impl.SampleInfoMapperImpl;

public class TestInsertEcho {
	//批量增 回显
	public static void main(String[] args) {
		SampleInfoMapper infoMapper = new SampleInfoMapperImpl();
		
		SampleInfo info = new SampleInfo();
		info.setId(null);
		info.setSampleId("s032");
		info.setCropCategoryId(3);
		info.setProvince("370000");
		info.setCity("371400");
		info.setCounty("371428");
		info.setHarvestTime(new Date());
		info.setSamplingTime(new Date());
		info.setSamplingPeople("5");
		info.setPollutionRate(2f);
		info.setCreateTime(new Date());
		info.setIsdel(1);
		info.setInputTime(new Date());
		info.setFlag(2);
		info.setEnterpeople(4);
		infoMapper.insert(info);
		
		System.out.println(info.getId());
		
		//中间表创对象填数据，一个对象对应一条数据
		SampleToxin sampleToxin = new SampleToxin();
		sampleToxin.setSampleInfoId(info.getId());
		sampleToxin.setId(null);
		sampleToxin.setToxinId(1);
		sampleToxin.setToxinCount(20f);
		SampleToxin sampleToxin1 = new SampleToxin();
		sampleToxin1.setSampleInfoId(info.getId());
		sampleToxin1.setId(null);
		sampleToxin1.setToxinId(2);
		sampleToxin1.setToxinCount(20f);
		SampleToxin sampleToxin2 = new SampleToxin();
		sampleToxin2.setSampleInfoId(info.getId());
		sampleToxin2.setId(null);
		sampleToxin2.setToxinId(3);
		sampleToxin2.setToxinCount(20f);
		SampleToxin sampleToxin3 = new SampleToxin();
		sampleToxin3.setSampleInfoId(info.getId());
		sampleToxin3.setId(null);
		sampleToxin3.setToxinId(4);
		sampleToxin3.setToxinCount(20f);
		
		List<SampleToxin> list = new ArrayList<>();
		list.add(sampleToxin3);
		list.add(sampleToxin2);
		list.add(sampleToxin1);
		list.add(sampleToxin);
		infoMapper.insertall(list);
	}
}



















