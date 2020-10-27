package com.boot.WebDemo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserFood {
	@Id
	private int ufid;

	private int id;
	private String fname;

	public UserFood(int ufid, int id, String fname) {
		super();
		this.ufid = ufid;
		this.id = id;
		this.fname = fname;
	}

	public UserFood() {

	}

	public UserFood(int id, String fname) {
		super();
		this.id = id;
		this.fname = fname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getUfid() {
		return ufid;
	}

	public void setUfid(int ufid) {
		this.ufid = ufid;
	}
}
