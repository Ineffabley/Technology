package com.dao;

import com.bean.FirstHBean;
import com.mapper.FirstHMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FirstHDao {

	private FirstHMapper mapper;

	// 作用:在测试方法前执行这个方法
	// @Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
		mapper = context.getBean(FirstHMapper.class);
	}

	public List<FirstHBean> getFirstList() throws Exception {
		setUp();
		List<FirstHBean> list = mapper.getFirstList();
		return list;
	}
}
