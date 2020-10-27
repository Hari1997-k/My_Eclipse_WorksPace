
package Com.spring.RowmapperDemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowmapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException, IncorrectResultSizeDataAccessException {
		Student std = new Student();
		std.setSid(rs.getInt(1));
		std.setSname(rs.getString(2));
		std.setSbranch(rs.getString(3)); // std.setSname(rs.getString(2));

		std.setSname(rs.getString("sname"));
		std.setSbranch(rs.getString("sbranch"));

		return std;
	}

}
