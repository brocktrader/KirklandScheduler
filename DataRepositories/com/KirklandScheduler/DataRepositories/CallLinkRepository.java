package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.CallLinkWrapper;
import com.KirklandScheduler.Wrappers.CallWrapper;

import java.util.ArrayList;
import java.util.List;

import com.KirklandScheduler.Models.CallLink;

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
