package com.KirklandScheduler.Wrappers;

import com.KirklandScheduler.DataRepositories.TitleRepository;
import com.KirklandScheduler.Models.Employee;

public class EmployeeWrapper extends Employee {

	private TitleRepository titleRepository;
	private TitleWrapper _title;
	
	public EmployeeWrapper() {
		titleRepository = new TitleRepository();
		
		_title = null;
	}
	
	public TitleWrapper getTitle(){
		if(_title == null){
			_title = titleRepository.getByPk(this.getTitleFk());
		}
		
		return _title;
	}

}
