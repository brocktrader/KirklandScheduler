package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.EmployeeJobWrapper;
import com.KirklandScheduler.Models.EmployeeJob;

public class EmployeeJobRepository implements IRepository {

	public EmployeeJobRepository() {
	}

	public EmployeeJobWrapper getByPk(Guid guid) {
		return new EmployeeJobWrapper();
	}

	public void Save(Object obj) {

	}

	public void Update(Object obj) {

	}

	public void Insert(Object obj) {

	}

	public void Delete(Object obj) {

	}

}
