package com;

public class Company {

	private int cid;
	
	private String name;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Comapny [cid=" + cid + ", name=" + name + "]";
	}
	
	
	
}
