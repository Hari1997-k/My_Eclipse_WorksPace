package com.spring.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.spring.domain.Plaza;
public class PlazaMapper implements RowMapper<Plaza> {
	@Override
	public Plaza mapRow(ResultSet rs, int arg1) throws SQLException {
		Plaza p = new Plaza();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setDescription(rs.getString("description"));
		return p;
	}
}
