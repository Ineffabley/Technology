package com.dao;

import com.bean.CodeBean;
import com.mapper.CodeMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CodeDao {

	private CodeMapper mapper;

	// 作用:在测试方法前执行这个方法
	// @Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
		mapper = context.getBean(CodeMapper.class);
	}
	
	 /**
	  * 得到code的列表
	 * @throws Exception 
	  */
	public List<CodeBean> getCodeList() throws Exception{
		setUp();
		List<CodeBean> list = mapper.getCodeList();
		return list;
	}
	
	
	/**
	 * 通过num得到Bean
	 * @throws Exception 
	 */
	public CodeBean getByNum(String code_num) throws Exception{
		setUp();
		CodeBean codeBean = mapper.getByNum(code_num);
		return codeBean;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
