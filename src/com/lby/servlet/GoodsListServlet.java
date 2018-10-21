package com.lby.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lby.model.Goods;
import com.lby.service.GoodsService;

/**
 * Servlet implementation class GoodsListServlet
 */
@WebServlet("/goods_list")
public class GoodsListServlet extends HttpServlet {

	private GoodsService gService=new GoodsService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=0;
		if(request.getParameter("id")!=null)
		{
			id=Integer.parseInt(request.getParameter("id")) ;
		}
		 List<Goods> list=gService.selectGoods(id, 1, 8);
		 request.setAttribute("list", list);
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/goodslist.jsp").forward(request, response);
		
	    
	}

}
