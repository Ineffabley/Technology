package com.mapper;

import com.bean.CityBean;

import java.util.List;

public interface CityMapper {

	// 通过city(id)获取cityBean对象
	public CityBean getCityById(int id);
	
	public List<CityBean> getCityList(String provinceId);
}
