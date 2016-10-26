package com.KirklandScheduler.DataRepositories;

import java.util.ArrayList;
import java.util.List;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.CallWrapper;

public class CallRepository implements IRepository {

	public CallRepository() {
	}

	public CallWrapper getByPk(Guid guid) {

		return new CallWrapper();
	}

	public void Save(Object obj) {

	}

	public void Update(Object obj) {

	}

	public void Insert(Object obj) {

	}

	public void Delete(Object obj) {

	}
	
	public List<CallWrapper> getCallsByDreamsheetFk(Guid dreamsheetPk){
		return new ArrayList<CallWrapper>();
	}
}
