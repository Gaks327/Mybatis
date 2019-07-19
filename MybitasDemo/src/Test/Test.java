package Test;

import java.util.List;

import bean.SampleInfo;
import bean.SampleToxin;
import dao.SampleInfoMapper;
import dao.impl.SampleInfoMapperImpl;

public class Test {

	//Æß±íÁª²é
	public static void main(String[] args) {
		SampleInfoMapper infoMapper = new SampleInfoMapperImpl();
		List<SampleInfo> inf = infoMapper.findAll();
		for (SampleInfo sampleInfo : inf) {
			System.out.println(sampleInfo.getSampleId() + "***" + sampleInfo.getAddressCity().getNameCity() +"****"+ sampleInfo.getAddressProvince().getNameProvince());
			for (SampleToxin sampleToxin : sampleInfo.getSampleToxins()) {
				System.out.println("\t\t" + sampleToxin.getInfo().getToxinType());
			}
		}
	}
}
