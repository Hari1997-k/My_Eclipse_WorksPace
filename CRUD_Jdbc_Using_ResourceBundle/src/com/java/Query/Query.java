package com.java.Query;

public class Query {
	
	public static String insert = "insert into Company values (?,?,?,?)";
	public static String delete = "delete from Company where cid = ?";
	public static String update =  "update Company set cname = ? , ctype = ? , ceo = ? where cid = ?";
	public static String list   = "select * from Company";
	public static String CmpById = "select * from Company where cid = ?";
	public static String CmpByNameAndId = "select * from Company where cid = ? and cname = ? ";
	

}
