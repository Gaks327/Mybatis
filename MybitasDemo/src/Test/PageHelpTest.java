package Test;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bean.SampleInfo;
import dao.SampleInfoMapper;
import dao.impl.SampleInfoMapperImpl;

public class PageHelpTest {

	//分页
	public static void main(String[] args) {
		SampleInfoMapper infoMapper = new SampleInfoMapperImpl();
		
		//启动分页插件  当前页，每页显示几条
		PageHelper.startPage(2, 3);
		List<SampleInfo> infos = infoMapper.findAll();
		//将要分页的集合放置到分页插件中
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
