package com.ssafy.news;

import java.util.List;

public interface INewsDAO {
	List<News> getNewsList(String url); //xml�޾ƿͼ� parsing�� VO(News)�� ��´�.
	public News search(int index);
}
