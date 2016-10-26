package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Models.Dreamsheet;
import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.DreamsheetWrapper;

public class DreamsheetRepository implements IRepository {

	public DreamsheetWrapper getByPk(Guid dreamsheetPk) {
		return new DreamsheetWrapper();
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
