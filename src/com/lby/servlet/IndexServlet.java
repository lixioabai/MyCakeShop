package com.lby.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lby.service.GoodsService;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	
	private GoodsService gService=new GoodsService();
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //取得热销商品
		List<Map<String,Object>> hotlist=gService.getHotGoodList();
		request.setAttribute("hotList", hotlist);
	
	   //取得条幅商品
		Map<String,Object> scrollgoods=gService.getSrollGoodList();
		request.setAttribute("scrollgoods", scrollgoods);
	   //取得新品商品
		List<Map<String,Object>> newlist=gService.getNewGoodList();
		request.setAttribute("newList", newlist);
		
	   //跳转到 index.jsp
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	

}
