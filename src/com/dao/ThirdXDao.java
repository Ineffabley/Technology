package com.dao;

import com.bean.ThirdXBean;
import com.mapper.FirstXMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ThirdXDao {
	
	private FirstXMapper mapper;

	// 作用:在测试方法前执行这个方法
	// @Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
		mapper = context.getBean(FirstXMapper.class);
	}
	
	public List<ThirdXBean> getThirdList(int parentId) throws Exception{
		setUp();
		List<ThirdXBean> list = mapper.getThirdList(parentId);

		return list;
	}
}
