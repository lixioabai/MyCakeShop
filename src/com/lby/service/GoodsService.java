package com.lby.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.lby.dao.GoodsDao;

public class GoodsService
{
	private GoodsDao gDao=new GoodsDao();
	
	//得到热销商品
	public List<Map<String,Object>> getHotGoodList() 
    {
		List<Map<String,Object>> list=null;
		
		try {
			list=gDao.getGoodList(2);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
    }
	
	//得到新品商品
	public List<Map<String,Object>> getNewGoodList()
	{
		List<Map<String,Object>> list=null;
		
		try {
			list=gDao.getGoodList(3);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return list;
	}
	
	//得到条幅商品
	public Map<String,Object> getSrollGoodList()
	{
		Map<String,Object> map=null;
		
		try {
			map=gDao.getScrollGoodList();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return map;
	}
	
	
}
