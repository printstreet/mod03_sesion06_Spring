package com.tecsup.gestion.services;


import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Employee;

public interface EmployeeService {
	Employee findEmployeeByLogin(String login) 
			throws DAOException, EmptyResultException;
	
	public Employee findEmployee(int employee_id) 
			throws DAOException, EmptyResultException;
}
