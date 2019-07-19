package Test;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bean.SampleInfo;
import dao.SampleInfoMapper;
import dao.impl.SampleInfoMapperImpl;

public class PageHelpTest {

	//��ҳ
	public static void main(String[] args) {
		SampleInfoMapper infoMapper = new SampleInfoMapperImpl();
		
		//������ҳ���  ��ǰҳ��ÿҳ��ʾ����
		PageHelper.startPage(2, 3);
		List<SampleInfo> infos = infoMapper.findAll();
		//��Ҫ��ҳ�ļ��Ϸ��õ���ҳ�����
		PageInfo<SampleInfo> info = new PageInfo<>(infos);
		/*for (SampleInfo sampleInfo : info.getList()) {
			System.out.println(sampleInfo);
		}*/
		
		System.out.println(info.getEndRow());
		System.out.println(info.getStartRow());
		System.out.println(info.getFirstPage());
		System.out.println(info.getLastPage());
		System.out.println(info.getNextPage());
		System.out.println(info.getPageNum());
		System.out.println(info.getPages());
		System.out.println(info.getSize());
	}
}
