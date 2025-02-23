package com.flm.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.flm.model.Employee;


public class EmployeeDaoImpl implements EmployeeDao{

	private String INSERT = "insert into employee(name, address,salary) values(?,?,?)";
	//private String INSERT1 = "insert into employee values(?,?,?,?)";
	private String UPDATE = "update employee set name=?, address=?,salary=? where id=?";
	private String DELETE = "delete from employee where id=?";
	private String GET_ONE = "select * from employee where id=?";
	private String GET_ALL = "select * from employee";
	private String SEARCH_ALL = "select * from employee where name like upper(?)";
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	@Transactional
	public void saveEmployee(Employee emp) {
		jdbcTemplate.update(INSERT, emp.getName(),emp.getAddress(),emp.getSalary());		
		//throw new RuntimeException();
	}

	@Override
	public void updateEmployee(Employee emp) {
		jdbcTemplate.update(UPDATE, emp.getName(),emp.getAddress(),emp.getSalary(),emp.getId());
	}

	@Override
	public void deleteEmployee(Long id) {
		jdbcTemplate.update(DELETE, id);
		
	}

	@Override
	public Employee getEmployee(Long id) {
		List<Employee> emps = jdbcTemplate.query(GET_ONE, new EmployeeRowMapper(),id);
		return emps.get(0);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emps = jdbcTemplate.query(GET_ALL, new EmployeeRowMapper());
		return emps;
	}

	@Override
	public List<Employee> getAllEmployees(String name) {
		List<Employee> emps = jdbcTemplate.query(SEARCH_ALL, new EmployeeRowMapper(),name);
		return emps;
	}

	@Override
	public void UpdateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	

}

