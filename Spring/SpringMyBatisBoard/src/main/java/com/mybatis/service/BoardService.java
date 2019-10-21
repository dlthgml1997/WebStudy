package com.mybatis.service;

import java.util.List;

import com.mybatis.vo.Board;

//client(BoardApp.java)를 위한 인터페이스
public interface BoardService {
	public List<Board> selectAll();
	public Board selectOne(String num) throws Exception;
	public void insert(Board c);
	public void delete(String num);
	public List<Board> findByTitle(String title);
	public List<Board> findByName(String name);
	
}