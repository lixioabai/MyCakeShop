package com.lby.listener;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.lby.model.Type;
import com.lby.service.TypeService;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
    
	private TypeService tService=new TypeService();

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	//�����ͷ���application�� ����ÿ��ҳ�涼�ܻ�ȡ������ֻ��ȡ1��
    	List<Type> list= tService.selectAll();
    	arg0.getServletContext().setAttribute("typelist", list);
    	
    }
	
}
