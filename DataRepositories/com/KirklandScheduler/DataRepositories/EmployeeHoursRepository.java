package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.EmployeeHoursWrapper;

public class EmployeeHoursRepository implements IRepository {

	public EmployeeHoursRepository() {
	}

	public EmployeeHoursWrapper getByPk(Guid guid) {
		return new EmployeeHoursWrapper();
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
