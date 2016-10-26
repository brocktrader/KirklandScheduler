package com.KirklandScheduler.Wrappers;

import com.KirklandScheduler.DataRepositories.CallRepository;
import com.KirklandScheduler.DataRepositories.EmployeeRepository;
import com.KirklandScheduler.Models.Availability;

public class AvailabilityWrapper extends Availability {

	private CallRepository callRepository;
	private EmployeeRepository employeeRepository;
	private CallWrapper _call;
	private EmployeeWrapper _employee;
	
	public AvailabilityWrapper() {
		callRepository = new CallRepository();
		
		_call = null;
		_employee = null;
	}

	public CallWrapper getCall(){
		if(_call == null){
			_call = callRepository.getByPk(this.getCallFk());
		}
		
		return _call;
	}
	
	public EmployeeWrapper getEmployee(){
		if(_employee == null){
			_employee = employeeRepository.getByPk(this.getEmployeeFk());
		}
		
		return _employee;
	}
}
