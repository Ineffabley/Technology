package com.dao;

import com.bean.CityBean;
import com.mapper.CityMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CityDao {

	private CityMapper mapper;

	// 作用:在测试方法前执行这个方法
	// @Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
		mapper = context.getBean(CityMapper.class);
	}
	
//	通过city(id)获取cityBean对象
	public CityBean getCityById(int id) throws Exception{
		setUp();
		CityBean cityBean = mapper.getCityById(id);

		return cityBean;
	}
	
	
	
	public List<CityBean> getCityList(String provinceId) throws Exception{
		setUp();
		List<CityBean> list = mapper.getCityList(provinceId);
		return list;
	}
	
	
}
