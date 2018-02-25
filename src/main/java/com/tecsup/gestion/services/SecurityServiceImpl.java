package com.tecsup.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.EmployeeDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Employee;


@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	@Override
	public Employee validate(String login, String clave) 
			throws LoginException, DAOException {
		// TODO Auto-generated method stub
		
		Employee emp = employeeDAO.validate(login, clave);
		
		//Employee emp=null;
		//if (login.equals("jgomez")&&clave.equals("123456")){			
		//	emp=new Employee();
		//	emp.setLogin("jgomez");
		//	emp.setPassword("123456");
		//}


		return emp;

	}
}
