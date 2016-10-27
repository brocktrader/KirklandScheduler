package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.JobWrapper;

public class JobRepository implements IRepository {

	public JobRepository() {
	}

	public JobWrapper getByPk(Guid guid) {
		return new JobWrapper();
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
