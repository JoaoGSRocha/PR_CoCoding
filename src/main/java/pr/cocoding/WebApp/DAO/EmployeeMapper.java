package pr.cocoding.WebApp.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import pr.cocoding.WebApp.model.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setAge(rs.getInt("age"));
		employee.setFirst(rs.getString("first"));
		employee.setLast(rs.getString("last"));
		      
		return employee;
	}
	
}