package com.KirklandScheduler.Models;

abstract class BaseModel {
	
	//region Variables
	/**
	 * Flag used when choosing whether to save or update the object.
	 * 
	 */
	private boolean _isFromDatabase;
	private boolean _isChanged;
	//endregion
	
	//region Constructors
	public BaseModel(boolean isFromDatabase) {
		_isChanged = false;
		_isFromDatabase = isFromDatabase;
	}
	//endregion
	
	//region Methods	
	public boolean getIsChanged() {
		return _isChanged;
	}

	public void setIsChanged(boolean isChanged) {
		_isChanged = isChanged;
	}
	
	public boolean getIsFromDatabase(){
		return _isFromDatabase;
	}
	
	protected void setIsFromDatabase(boolean isFromDatabase){
		_isFromDatabase = isFromDatabase;
	}
	//endregion
}
