package com.KirklandScheduler.Wrappers;

import com.KirklandScheduler.DataRepositories.DreamsheetRepository;
import com.KirklandScheduler.DataRepositories.EmployeeRepository;
import com.KirklandScheduler.Models.EmployeeHours;

public class EmployeeHoursWrapper extends EmployeeHours{

	private EmployeeRepository employeeRepository;
	private DreamsheetRepository dreamsheetRepository;
	private EmployeeWrapper _employee;
	private DreamsheetWrapper _dreamsheet;
	
	public EmployeeHoursWrapper() {
		employeeRepository = new EmployeeRepository();
		dreamsheetRepository = new DreamsheetRepository();
		
		_employee = null;
		_dreamsheet = null;
	}
	
	public EmployeeWrapper getEmployee(){
		if(_employee == null){
			_employee = employeeRepository.getByPk(this.getEmployeeFk());
		}
		
		return _employee;
	}
	
	public DreamsheetWrapper getDreamsheet(){
		if(_dreamsheet == null){
			_dreamsheet = dreamsheetRepository.getByPk(this.getDreamsheetFk());
		}
		
		return _dreamsheet;
	}

	
	
}
