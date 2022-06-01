package org.springframework.beans.testBean;


public class person {
	private String name;
	private String sex;

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}
}
