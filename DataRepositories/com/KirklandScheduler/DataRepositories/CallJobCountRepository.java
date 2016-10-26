package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.CallJobCountWrapper;
import com.KirklandScheduler.Models.CallJobCount;

public class CallJobCountRepository implements IRepository {

	public CallJobCountRepository() {
	}

	public CallJobCountWrapper getByPk(Guid guid) {
		return new CallJobCountWrapper();
	}

	public void Save(Object obj) {

	}

	public void Update(Object obj) {

	}

	public void Insert(Object obj) {

	}

	public void Delete(Object obj) {

	}

	public int getCountByJobFkAndCallFk(Guid jobFk, Guid callFk) {
		return 0;
	}

}
