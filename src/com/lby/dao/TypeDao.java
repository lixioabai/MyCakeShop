package com.lby.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.lby.model.Type;
import com.lby.utils.DBUtil;

public class TypeDao 
{
   public List<Type> SelectAll() throws SQLException
   {
	   QueryRunner r=new QueryRunner(DBUtil.getDataSource());
	   String sql="select * from type ";
	   return  r.query(sql, new BeanListHandler<Type>(Type.class));
	   
   }
}
