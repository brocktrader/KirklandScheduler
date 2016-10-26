package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.TitleWrapper;
import com.KirklandScheduler.Models.Title;

public class TitleRepository implements IRepository {

	public TitleRepository() {

	}

	public TitleWrapper getByPk(Guid guid) {
		return new TitleWrapper();
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
