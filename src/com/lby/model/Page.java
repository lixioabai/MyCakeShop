package com.lby.model;
//一个分页的数据模型

import java.util.List;

public class Page 
{
	private int pageNum;  //当前是第几页
	private int pageSize; //每一页显示多少条
    private int totalCount; //总记录数
    private int totalPage; //总页数
    
    private List<Object> list;

    public void SetPageSizeAndTotalCount(int pageSize,int totalCount)
    {
    	totalPage=(int)Math.ceil((double)totalCount/pageSize);
    	
    }
    
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTaotalPage() {
		return totalPage;
	}

	public void setTaotalPage(int taotalPage) {
		this.totalPage = taotalPage;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
    
    
}
