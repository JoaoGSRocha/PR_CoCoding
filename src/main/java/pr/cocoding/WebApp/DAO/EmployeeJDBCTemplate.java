package pr.cocoding.WebApp.DAO;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import pr.cocoding.WebApp.model.Employee;

public class EmployeeJDBCTemplate implements EmployeeDAO{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public Employee getEmployee(int id) {
		String SQL = "select * from Employees where id = ?";
		Employee employee = jdbcTemplateObject.queryForObject(SQL, 
		new Object[]{id}, new EmployeeMapper());
		return employee;
	}

}
