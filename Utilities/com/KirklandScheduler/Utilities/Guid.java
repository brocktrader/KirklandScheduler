package com.KirklandScheduler.Utilities;

import java.util.UUID;

public class Guid {
	
	//region Variable
	private String _guidString;
	//endregion
	
	//region Constructors
	public Guid(){
		_guidString = java.util.UUID.randomUUID().toString();
	}
	
	public Guid(String guidString){
		_guidString = guidString;
	}
	
	public Guid(UUID guid){
		_guidString = guid.toString();
	}
	//endregion

	//region Methods
	public String getGuidString(){
		return this._guidString;
	}
	//endregion
}
