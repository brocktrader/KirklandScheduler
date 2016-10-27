package com.KirklandScheduler.DataRepositories;

import java.util.Date;
import java.util.List;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.AvailabilityWrapper;

public class AvailabilityRepository implements IRepository {

	public AvailabilityRepository() {
	}

	public AvailabilityWrapper getByPk(Guid guid) {
		return new AvailabilityWrapper();
	}

	public void Save(Object obj) {

	}

	public void Update(Object obj) {

	}

	public void Insert(Object obj) {

	}

	public void Delete(Object obj) {

	}

	public AvailabilityWrapper getByCallFk(Guid callFk){
		return null;
	}
	
	public AvailabilityWrapper getByEmployeeFk(Guid employeeFk){
		return null;
	}
	
	public List<AvailabilityWrapper> getAvailabilityBetweenDates(Date startDate, Date endDate){
		return null;
	}
	
}
