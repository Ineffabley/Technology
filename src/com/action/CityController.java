package com.action;

import com.alibaba.fastjson.JSON;
import com.bean.CityBean;
import com.dao.CityDao;
import com.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;


@Controller
@RequestMapping(value="/CityController") 
public class CityController {

	@RequestMapping(value = "/getCity", method = RequestMethod.POST)
	private void getCity(HttpServletRequest req, HttpServletResponse resp) throws Exception { 
		int parentId = StringUtil.StringToInt(req.getParameter("id"));
		CityDao cityDao = new CityDao();
		System.out.println("转到getCity");
		List<CityBean> cityList = cityDao.getCityList(String.valueOf(parentId));
		//System.out.println(cityList.get(0).getName());
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(JSON.toJSONString(cityList));
		out.flush();
		out.close();

		}
	

}
