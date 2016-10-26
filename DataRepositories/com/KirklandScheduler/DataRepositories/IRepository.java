package com.KirklandScheduler.DataRepositories;

import com.KirklandScheduler.Utilities.Guid;

public interface IRepository {

	public Object getByPk(Guid guid);

	public void Save(Object obj);

	public void Update(Object obj);

	public void Insert(Object obj);

	public void Delete(Object obj);
}
