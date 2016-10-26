package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.CallTitleCountWrapper;

public class CallTitleRepository implements IRepository {

	public CallTitleRepository() {
	}

	public CallTitleCountWrapper getByPk(Guid guid) {
		return new CallTitleCountWrapper();
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
