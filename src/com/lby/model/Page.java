package com.lby.model;
//һ����ҳ������ģ��

import java.util.List;

public class Page 
{
	private int pageNum;  //��ǰ�ǵڼ�ҳ
	private int pageSize; //ÿһҳ��ʾ������
    private int totalCount; //�ܼ�¼��
    private int totalPage; //��ҳ��
    
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
