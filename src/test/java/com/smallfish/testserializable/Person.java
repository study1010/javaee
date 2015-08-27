package com.smallfish.testserializable;

import java.io.Serializable;


//jdk 7.0 不需要在加Serializable

//接口的作用：
//1、约束类的行为、规范
//2、标示接口
//3、常量接口
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private int id ;
	
	

}
