package com.lby.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.lby.dao.GoodsDao;
import com.lby.model.Goods;
import com.lby.model.Page;

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
	
	
//	public List<Goods> selectGoods(int typeId,int pageNum,int pageSize)
//	{
//		List<Goods>  list=null;
//		try {
//			list=gDao.selectGoods(typeId, pageNum, pageSize);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return list;
//	}
	
	//得到商品页面
	public Page getGoodsPage(int typeId,int pageNum)
	{
		Page p=new Page();
		p.setPageNum(pageNum);
		int totalCount=0;
		int totalPage;
		try
		{
			totalCount=gDao.getGoodsCount(typeId);
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		p.SetPageSizeAndTotalCount(3, totalCount);
		
		List list=null;
		try {
			list=gDao.selectGoods(typeId, pageNum, 3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p.setList(list);
		
		return p;
	}
	
	
}
