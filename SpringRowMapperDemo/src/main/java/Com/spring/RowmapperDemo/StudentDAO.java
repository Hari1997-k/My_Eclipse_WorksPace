package Com.spring.RowmapperDemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAO {
	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	
	/*
	 * public int insertStudent(Student s) { String query =
	 * "insert into student values(?,?,?)"; return jdbctemplate.update(query,
	 * s.getSid() , s.getSname() , s.getSbranch());
	 * 
	 * }
	 */
	 

/*
 * public List<Student> getStudents(Student s){ String query
 * ="select sid , sname , sbranch from student"; List<Student>sde =
 * jdbctemplate.query(query,new RowMapper<Student>() { Student std = new
 * Student(); public Student mapRow(ResultSet rs, int rowNum) throws
 * SQLException { std.setSid(rs.getInt(1)); std.setSname(rs.getString(2));
 * std.setSbranch(rs.getString(3)); return std; }
 * 
 * }); return sde; } }
 */

	//getting all students using single entity (sid) from table:
	/*public Student getAllBysid(int id) {
		String query = "select sid , sname , sbranch from student where sid=?";
		Student sd= null;
		//String query = "select sid from student where sid = ?";
		StudentRowmapper  smp = new StudentRowmapper();
		List<Student> sdt =  jdbctemplate.query(query, smp , id);
		if(sdt.size()>0) {
		sd = sdt.get(0);
		}
		return sd;
	}
}*/
		
	
	//getting all students using single entity(sname)  from table:

	/*public Student GetAllStudentsBySname(String sname) {
	Student s = null;
		String query = "select sid , sname , sbranch from student where sname = ?";
		List<Student> slst = jdbctemplate.query(query, new RowMapper<Student>() {
			Student std = new Student();
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				std.setSid(rs.getInt(1));
				std.setSname(rs.getString(2));
				std.setSbranch(rs.getString(3));
				
				return std;
			}
			
		}, sname);
		if(slst.size()>0) {
			s= slst.get(1);
		}
		return s;
		
	}*/
	
	
		/*public List<Student> getSTD() {
			Student ss = null;
			String sql = "select * from student";
			List<Student> st = jdbctemplate.query(sql, new RowMapper<Student>() {

				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					Student smp = new Student();
					smp.setSid(rs.getInt(1));

					smp.setSname(rs.getString(2));

					smp.setSbranch(rs.getString(3));
					return smp;
				}
				});
			return st;
		}*/
		
	  //for getting only one entity(sbranch) from table :
	/*
	 * public Student getsBranch(String sname) { String sql =
	 * "select sbranch from student where sname = ?"; Student st =
	 * jdbctemplate.queryForObject(sql, new RowMapper<Student>() {
	 * 
	 * public Student mapRow(ResultSet rs, int rowNum) throws SQLException { Student
	 * smp = new Student();
	 * 
	 * smp.setSbranch(rs.getString(1)); return smp; } }, new Object[]{sname});
	 * return st; }
	 */

}