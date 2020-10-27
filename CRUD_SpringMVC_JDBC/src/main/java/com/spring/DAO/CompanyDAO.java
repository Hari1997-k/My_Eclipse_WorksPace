package com.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.domain.Company;

public class CompanyDAO {
	private JdbcTemplate jdbctemplate ;
	@Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	
	public Company createCompany(Company c) {
		String query = "insert into Company values (?,?,?,?)";
		jdbctemplate.update(query ,c.getCid() , c.getCname() , c.getCtype(), c.getCbranches());
		return c ;
		}
	
	
	public List<Company> clist(){
		
	String query = "select * from Company";
	List<Company> clist  = jdbctemplate.query(query , new RowMapper<Company>() {

		@Override
		public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
			Company cmp = new Company();
			cmp.setCid(rs.getInt("cid"));
			cmp.setCname(rs.getString("cname"));
			cmp.setCtype(rs.getString("ctype"));
			cmp.setCbranches(rs.getString("cbranches"));
			return cmp;
		}
		
	});
	return clist;
		
	}
	
	public Company CmpById(int cid){
		
		String query = "select * from Company where cid = ?";
		Company cpn =  jdbctemplate.queryForObject(query , new RowMapper<Company>() {

			@Override
			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company cmp = new Company();
				cmp.setCid(rs.getInt("cid"));
				cmp.setCname(rs.getString("cname"));
				cmp.setCtype(rs.getString("ctype"));
				cmp.setCbranches(rs.getString("cbranches"));
				return cmp;
			}
			
		} , new Object[] {cid});
		return cpn;
			
		}
public Company login(int cid , String cname){
		
		String query = "select * from Company where cid = ? and cname = ? ";
		Company cpn =  jdbctemplate.queryForObject(query , new RowMapper<Company>() {

			@Override
			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company cmp = new Company();
				cmp.setCid(rs.getInt("cid"));
				cmp.setCname(rs.getString("cname"));
				cmp.setCtype(rs.getString("ctype"));
				cmp.setCbranches(rs.getString("cbranches"));
				return cmp;
			}
			
		} , new Object[] {cid , cname});
		return cpn;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int DeleteCmpny(int cid) {
		String query = "delete from company where cid = ?";
		return jdbctemplate.update(query , new Object[] {cid});
	}
	
	
	public int UpdateEmployee(Company c) {
		String query = "update Company set cname =? , ctype = ? , cbranches = ? where cid =?";
		return jdbctemplate.update(query , new Object[] {c.getCname() , c.getCtype() , c.getCbranches() ,c.getCid()});
	}
}
