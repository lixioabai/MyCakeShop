package com.lby.utils;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil 
{
   private static DataSource ds=new ComboPooledDataSource();
   
   public static DataSource getDataSource()
   {
	   return ds;
   }
}
