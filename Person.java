package pers.wxl.shop;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer age;
	
	public Person(){
		super();
	}
	
	public Person(String name,Integer age){
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
