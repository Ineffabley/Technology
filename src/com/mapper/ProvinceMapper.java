package com.mapper;

import com.bean.ProvinceBean;

import java.util.List;

public interface ProvinceMapper {

	// 通过province(id)获取provinceBean对象
	public ProvinceBean getProvinceById(int id);

	/**
	 * 获取ProvinceBeans,LIST
	 */
	public List<ProvinceBean> getProvinceList();
}
