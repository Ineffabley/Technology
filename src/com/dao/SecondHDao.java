package com.dao;

import com.bean.SecondHBean;
import com.mapper.FirstHMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SecondHDao {
	
	private FirstHMapper mapper;

	// 作用:在测试方法前执行这个方法
	// @Before
	public void setUp() throws Exception {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
			mapper = context.getBean(FirstHMapper.class);

	}
	
	public List<SecondHBean> getSecondList(int parentId) throws Exception{
		setUp();

		List<SecondHBean> list = mapper.getSecondList(parentId);

		return list;
	}
}
