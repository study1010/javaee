package com.smallfish.testserializable;

import java.io.Serializable;


//jdk 7.0 ����Ҫ�ڼ�Serializable

//�ӿڵ����ã�
//1��Լ�������Ϊ���淶
//2����ʾ�ӿ�
//3�������ӿ�
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
