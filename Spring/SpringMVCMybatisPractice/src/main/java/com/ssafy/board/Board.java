package com.ssafy.board;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;
public class Board implements Serializable {
	private int no        	 ;
	private String id        ;
	private String title     ;
	private String contents  ;
	
	//디폴트 생성자 필수!!
	public Board() {};
	
	public Board(String id, String title, String contents) {
		this.id = id;
		this.title = title;
		this.contents = contents;
	}

	public Board(int no, String id, String title,  String contents) {
		super();
		this.no = no;
		this.id = id;
		this.title = title;
		this.contents = contents;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [no=").append(no).append(", id=").append(id).append(", title=").append(title)
				.append(", contents=").append(contents);
		return builder.toString();
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
