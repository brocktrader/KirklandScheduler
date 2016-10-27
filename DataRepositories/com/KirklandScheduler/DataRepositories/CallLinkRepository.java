package com.KirklandScheduler.DataRepositories;

import java.util.List;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.CallLinkWrapper;
import com.KirklandScheduler.Wrappers.CallWrapper;

public class CallLinkRepository implements IRepository {
	
	public CallLinkRepository() {

	}

	public CallLinkWrapper getByPk(Guid guid) {
		return new CallLinkWrapper();
	}

	public void Save(Object obj) {

	}

	public void Update(Object obj) {

	}

	public void Insert(Object obj) {

	}

	public void Delete(Object obj) {

	}

	public List<CallWrapper> getLinkedCallsByCallFk(Guid callFk) {
		return null;
	}

}
