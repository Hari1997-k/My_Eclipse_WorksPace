package Com.spring.SpringJdbcCRUD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class CmpDAO {

	private JdbcTemplate jdbcTemplate;

	public synchronized JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public synchronized void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	
	}

	public int CreateCompany(Company c) {
		String query = "insert into company values (?,?,?)";
		Company com = new Company();
		return jdbcTemplate.update(query , c.getCid() , c.getCname() , c.getCtype());
		}
	
	public int DeleteCompany(int cid) {
		String query = "delete from Company where id = ?";
		int del = jdbcTemplate.update(query , new Object[] {cid});
		return del;
	}
	

	public int DeleteByNameAndType(String ctype , String cname) {
		String query = "delete from company where cname = ? and ctype = ?";
		int del = jdbcTemplate.update(query , new Object[] {cname ,ctype  });
		return del;
		
	}
	
	
	public int updateCnameCtypeById(int cid , String cname , String ctype) {
		String query = "update company set cname = ? , ctype = ? where id = ?";
		int upd = jdbcTemplate.update(query , new Object[] { cname , ctype , cid ,});
		return upd;
	}
	public int UpdateCNameByCid(int cid , String cname) {
		String  query = "update company set cname = ? where id = ?";
		int upd = jdbcTemplate.update(query , new Object[] {cname , cid});
		return upd;
	}
	public int UpdateCidByCname(int cid , String cname) {
		String query = "update company set id = ? where cname = ?";
		int upd = jdbcTemplate.update(query , new Object[] {cid , cname});
		return upd;
	}
	public List<Company> listOfComapanies(){
		String query = "select * from company";
		List<Company> cpp = jdbcTemplate.query(query, new RowMapper<Company>() {

			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company com  = new Company();
				com.setCid(rs.getInt(1));
				com.setCname(rs.getString(2));
				com.setCtype(rs.getString(3));
				return com;
			}
			
		});
		return cpp;
		
	}
	
	public List<Company> Get_ListOfCompanys_ById(int cid){
		String query = "select * from company where id = ?";
		List<Company> clst = jdbcTemplate.query(query , new RowMapper<Company>() {

			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company com = new Company();
				com.setCid(rs.getInt(1));
				com.setCname(rs.getString(2));
				com.setCtype(rs.getString(3));
				return com;
			}
			
		} , cid);
		return clst;
		
	}
	
	public List<Company>  Get_ListOfCompanys_FromTable(){
		String query = "select id , cname , ctype from company";
		List<Company> clst = jdbcTemplate.query(query , new RowMapper<Company>() {

			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company com = new Company();
				com.setCid(rs.getInt(1));
				com.setCname(rs.getString(2));
				com.setCtype(rs.getString(3));
				return com;
			}
			});
		return clst;
		
	}
	public List<Company> Get_ListOfCompanys_ByName(String cname){
		String query = "select id , cname ,ctype from company where cname = ?";
		List<Company> clist = jdbcTemplate.query(query , new RowMapper<Company>() {

			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company com = new Company();
				com.setCid(rs.getInt(1));
				com.setCname (rs.getString(2));
				com.setCtype(rs.getString(3));
				return com;
			}
		 	},cname);
		return clist;
	}
	
	public Company getCnameBy_Cid(int cid) {
		String query = "select cname from company where id = ?";
		Company  cpn = jdbcTemplate.queryForObject(query, new RowMapper<Company>() {

			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company com = new Company();
				com.setCname(rs.getString(1));
				return com;
			}
			} , new Object[] {cid});
		return cpn;
	}
	
	public Company getCname_CtypeBy_Cid(int cid) {
		String query = "select cname , ctype from company where id = ?";
		Company cpn = jdbcTemplate.queryForObject(query , new RowMapper<Company>() {

			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company com	 = new Company();
				com.setCname(rs.getString(1));
				com.setCtype(rs.getString(2));
				return com;
			}
			} , new Object[] {cid});
		return cpn;
		
	}

		}
	
