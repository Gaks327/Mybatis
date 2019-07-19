package Test;

import java.util.ArrayList;
import java.util.List;

import bean.SampleToxin;
import dao.SampleInfoMapper;
import dao.impl.SampleInfoMapperImpl;

public class TestAddBatch {

	public static void main(String[] args) {
		SampleInfoMapper infoMapper = new SampleInfoMapperImpl();
		
		//批量查
		/*String[] ids = {"2","4","5"};
		infoMapper.selectinfo(ids);*/
		
		//批量增
		SampleToxin sampleToxin = new SampleToxin();
		sampleToxin.setId(null);
		sampleToxin.setSampleInfoId(1);
		sampleToxin.setToxinCount(3f);
		sampleToxin.setToxinId(3);
		SampleToxin sampleToxin2 = new SampleToxin();
		sampleToxin2.setId(null);
		sampleToxin2.setSampleInfoId(1);
		sampleToxin2.setToxinCount(3f);
		sampleToxin2.setToxinId(3);
		SampleToxin sampleToxin3= new SampleToxin();
		sampleToxin3.setId(null);
		sampleToxin3.setSampleInfoId(1);
		sampleToxin3.setToxinCount(3f);
		sampleToxin3.setToxinId(3);
		List<SampleToxin> list = new ArrayList<>();
		list.add(sampleToxin3);
		list.add(sampleToxin2);
		list.add(sampleToxin);
		infoMapper.insertall(list);
	}
}






























































