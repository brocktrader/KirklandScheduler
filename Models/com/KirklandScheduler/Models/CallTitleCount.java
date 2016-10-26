package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class CallTitleCount extends BaseModel {

	//region Variables
	private Guid _callTitleCountPk;
	private Guid _callFk;
	private Guid _titleFk;
	private int _count; 
	//endregion
	
	//region Constructors
	public CallTitleCount() { super(false); }
	
	public CallTitleCount(Guid callTitleCountPk, Guid callFk, Guid titleFk, int count, boolean isFromDatabase) {
		super(isFromDatabase);
		_callTitleCountPk = callTitleCountPk;
		_callFk = callFk;
		_titleFk = titleFk;
		_count = count;
	}
	//endregion

	//region Methods
	public Guid getCallTitlePk() {
		return _callTitleCountPk;
	}
	public void setCallTitlePk(Guid callTitleCountPk) {
		_callTitleCountPk = callTitleCountPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);
	}
	public Guid getCallFk() {
		return _callFk;
	}
	public void setCallFk(Guid callFk) {
		_callFk = callFk;
	}
	public Guid getTitleFk() {
		return _titleFk;
	}
	public void setTitleFk(Guid titleFk) {
		_titleFk = titleFk;
		setIsChanged(true);
	}
	public int getCount() {
		return _count;
	}
	public void setCount(int count) {
		_count = count;
		setIsChanged(true);
	}
	//endregion
}
