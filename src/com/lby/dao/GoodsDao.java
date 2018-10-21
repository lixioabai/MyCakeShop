package com.lby.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.lby.model.Goods;
import com.lby.utils.DBUtil;

public class GoodsDao 
{
   //select g.name,g.id,g.cover,g.price,t.name typename from recommend r,goods g ,type t where type=2 AND r.goods_id=g.id and g.type_id=t.id;
	
    //根据推荐类型得到商品列表
	public List<Map<String,Object>> getGoodList(int recommendType) throws SQLException
    {
    	QueryRunner r=new QueryRunner(DBUtil.getDataSource());
    	String sql="select g.name,g.id,g.cover,g.price,t.name typename from recommend r,goods g ,type t where type=? AND r.goods_id=g.id and g.type_id=t.id;";
        
    	return r.query(sql, new MapListHandler(),recommendType);
    } 
	
	//得到条幅商品
	public Map<String,Object> getScrollGoodList() throws SQLException
    {
    	QueryRunner r=new QueryRunner(DBUtil.getDataSource());
    	String sql="select g.name,g.id,g.cover,g.price from recommend r,goods g  where type=1 AND r.goods_id=g.id";
        
    	return r.query(sql, new MapHandler()); //得到的只有一条记录
    } 
	
	//
	public List<Goods> selectGoods(int typeId,int pageNum,int pageSize) throws SQLException
	{
		
		QueryRunner r=new QueryRunner(DBUtil.getDataSource());
		if(typeId==0)
		{
			String sql="select * from goods limit ?,?";
		  return	r.query(sql, new BeanListHandler<>(Goods.class),(pageNum-1)*pageSize,pageSize);

		}
		else
		{
			String sql="select * from goods where type_id=? limit ?,?";
	      return	r.query(sql, new BeanListHandler<>(Goods.class),typeId,(pageNum-1)*pageSize,pageSize);
			
		}
		
	}
}
