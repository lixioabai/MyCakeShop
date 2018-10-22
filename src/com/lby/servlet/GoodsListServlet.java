package com.lby.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lby.model.Goods;
import com.lby.model.Page;
import com.lby.model.Type;
import com.lby.service.GoodsService;
import com.lby.service.TypeService;

/**
 * Servlet implementation class GoodsListServlet
 */
@WebServlet("/goods_list")
public class GoodsListServlet extends HttpServlet {

	private GoodsService gService=new GoodsService();
	private TypeService tService=new TypeService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id=0;
		if(request.getParameter("id")!=null)
		{
			id=Integer.parseInt(request.getParameter("id")) ;
		}
		int pageNum=1;
		if(request.getParameter("pageNum")!=null)
		{
			pageNum=Integer.parseInt(request.getParameter("pageNum"));
		}

//		 List<Goods> list=gService.selectGoods(id, pageNum, 3);
//		 request.setAttribute("list", list);
		 
		Page p=gService.getGoodsPage(id, pageNum);
		
		 request.setAttribute("p", p);
		 request.setAttribute("id",id);
		 
		 Type t=null;
			if(id!=0)
			{
				t=tService.select(id);
			}
			
			request.setAttribute("t",t);
		 
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/goodslist.jsp").forward(request, response);
		
		
	    
	}

}
