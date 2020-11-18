package com.dao;

import com.bean.ProvinceBean;
import com.mapper.ProvinceMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProvinceDao {

	private ProvinceMapper mapper;

	// 作用:在测试方法前执行这个方法
	// @Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
		 mapper = context.getBean(ProvinceMapper.class);
	}

	// 通过province(id)获取provinceBean对象
	public ProvinceBean getProvinceById(int id) throws Exception {
	    setUp();
		ProvinceBean pBean = mapper.getProvinceById(id);
		return pBean;
	}

	/**
	 * 获取ProvinceBeans,LIST
	 * @throws Exception 
	 */
	public List<ProvinceBean> getProvinceList() throws Exception {
		setUp();
		List<ProvinceBean> list = mapper.getProvinceList();
		return list;
	}
}
