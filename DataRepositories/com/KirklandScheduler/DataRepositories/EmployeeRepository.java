package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.EmployeeWrapper;

public class EmployeeRepository implements IRepository {

	public EmployeeRepository() {
	}

	public EmployeeWrapper getByPk(Guid guid) {
		return new EmployeeWrapper();
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
