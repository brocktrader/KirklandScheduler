package com.KirklandScheduler.Wrappers;

import com.KirklandScheduler.DataRepositories.EmployeeRepository;
import com.KirklandScheduler.Models.Authentication;
import com.KirklandScheduler.Models.Employee;

public class AuthenticationWrapper extends Authentication {

	private EmployeeRepository employeeRepository;
	private EmployeeWrapper _employee;
	
	public AuthenticationWrapper() {
		employeeRepository = new EmployeeRepository();
		
		_employee = null;
	}
	
	public EmployeeWrapper getEmployee(){
		if(_employee == null){
			_employee = employeeRepository.getByPk(this.getEmpFk());
		}
	
		return _employee;
	}

}
