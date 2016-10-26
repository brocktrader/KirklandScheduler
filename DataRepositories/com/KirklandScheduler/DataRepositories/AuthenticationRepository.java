package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Models.Authentication;
import com.KirklandScheduler.Utilities.Guid;
import com.KirklandScheduler.Wrappers.AuthenticationWrapper;

public class AuthenticationRepository implements IRepository {

	public AuthenticationWrapper getByPk(Guid guid) {
		return new AuthenticationWrapper();
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
