package com.lby.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.lby.utils.DBUtil;

public class GoodsDao 
{
   //select g.name,g.id,g.cover,g.price,t.name typename from recommend r,goods g ,type t where type=2 AND r.goods_id=g.id and g.type_id=t.id;
	
    //�����Ƽ����͵õ���Ʒ�б�
	public List<Map<String,Object>> getGoodList(int recommendType) throws SQLException
    {
    	QueryRunner r=new QueryRunner(DBUtil.getDataSource());
    	String sql="select g.name,g.id,g.cover,g.price,t.name typename from recommend r,goods g ,type t where type=? AND r.goods_id=g.id and g.type_id=t.id;";
        
    	return r.query(sql, new MapListHandler(),recommendType);
    } 
	
	//�õ�������Ʒ
	public Map<String,Object> getScrollGoodList() throws SQLException
    {
    	QueryRunner r=new QueryRunner(DBUtil.getDataSource());
    	String sql="select g.name,g.id,g.cover,g.price from recommend r,goods g  where type=1 AND r.goods_id=g.id";
        
    	return r.query(sql, new MapHandler()); //�õ���ֻ��һ����¼
    } 
	
}
