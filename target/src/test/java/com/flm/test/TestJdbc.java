package com.flm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;

public class TestJdbc {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("abc.xml");		

		EmployeeDao dao = ctx.getBean("dao", EmployeeDao.class);
		Employee emp = new Employee("siva", "Hyderabad", 36000D);
		dao.saveEmployee(emp);
		System.out.println("Done!!");
	}
}