package com.dao;

import com.bean.AdminBean;
import com.mapper.AdminMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AdminDao extends SqlSessionDaoSupport {

	private AdminMapper mapper;


	// 作用:在测试方法前执行这个方法
	// @Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml");
		mapper = context.getBean(AdminMapper.class);
	}
	
	/**
	 * 添加用户到数据库中
	 */
	public void insertUser(AdminBean adminBean) throws Exception {
		// 创建能执行映射文件中sql的sqlSession
		setUp();
		mapper.insertUser(adminBean);
	}
	public  String findJGMC(String username) throws Exception {
		setUp();
		return mapper.findJGMC(username);

	}


	/**
	 * 权限管理
	 * 
	 * @throws Exception
	 */
	public boolean up(String username, int status) throws Exception {
		setUp();
		AdminBean adminBean = new AdminBean();
		adminBean.setUsername(username);
		adminBean.setStatus(status);
		int n = mapper.up(adminBean);
		if (n > 0)
			return true;
		return false;

	}

	/**
	 * 获取用户信息列表 =3
	 * 
	 * @throws Exception
	 */
	public List<AdminBean> getByStatus() throws Exception {
		setUp();

		List<AdminBean> list = mapper.getByStatus();

		return list;
	}

	/**
	 * 获取用户信息列表 不为3
	 * 
	 * @throws Exception
	 */
	public List<AdminBean> getByStatusB() throws Exception {
		setUp();
		List<AdminBean> list = mapper.getByStatusB();
		return list;
	}

	/**
	 * 获取用户信息列表 总的
	 * 
	 * @throws Exception
	 */
	public List<AdminBean> getUserList() throws Exception {
		setUp();
		List<AdminBean> list = mapper.getUserList();

		return list;
	}

	/**
	 * 更新基本信息
	 * 
	 */
	public boolean updateX(AdminBean adminBean) throws Exception {

		setUp();
		int n = mapper.updateX(adminBean);
		if (n > 0)
			return true;
		return false;
	}

	/**
	 * 检测该用户名是否存在
	 */
	public boolean checkReg(String username) throws Exception {
		System.out.println("调用checkReg!");
		setUp();

		AdminBean user = new AdminBean();
		user = mapper.checkReg(username);
		if (user == null)
			return false;

		System.out.println("是否检查到名字:" + user.getUsername());
		return true;
	}

	/**
	 * 判断是否被分配角色
	 */
	public int checkF(String username) throws Exception {
		setUp();

		AdminBean user = mapper.getByUsername(username);

		return user.getStatus();
	}

	/**
	 * 登录验证
	 * 
	 * @throws Exception
	 */
	public AdminBean userLogin(String username, String password) throws Exception {
		setUp();

		AdminBean user = new AdminBean();
		user.setUsername(username);
		user.setPassword(password);

		AdminBean admin = mapper.userLogin(user);
		System.out.println("名字为：" + admin.getName());
		return admin;
	}

	/**
	 * 通过username得到Bean
	 * 
	 * @throws Exception
	 */
	public AdminBean getByUsername(String username) throws Exception {
		setUp();


		AdminBean user = mapper.getByUsername(username);

		return user;
	}

	/**
	 * 修改密码
	 * 
	 * @throws Exception
	 */
	public boolean updatePsw(String username, String password) throws Exception {

		setUp();


		AdminBean adminBean = new AdminBean();
		adminBean.setUsername(username);
		adminBean.setPassword(password);

		int n = mapper.updatePsw(adminBean);

		if (n > 0)
			return true;
		return false;
	}

	/**
	 * 删除 注销 用户
	 * 
	 * @throws Exception
	 */
	public boolean deleteUser(String username) throws Exception {
		setUp();

		int n = mapper.deleteUser(username);

		if (n > 0)
			return true;
		return false;
	}

}
