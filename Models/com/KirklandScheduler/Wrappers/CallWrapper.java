package com.KirklandScheduler.Wrappers;

import com.KirklandScheduler.DataRepositories.DreamsheetRepository;
import com.KirklandScheduler.Models.Call;

public class CallWrapper extends Call {
	
	private DreamsheetRepository dreamsheetRepository;
	private DreamsheetWrapper _dreamsheet;
	
	public CallWrapper(){
		dreamsheetRepository = new DreamsheetRepository();
		
		_dreamsheet = null;
	}
	
	public DreamsheetWrapper getDreamsheet(){
		if(_dreamsheet == null){
			_dreamsheet = dreamsheetRepository.getByPk(this.getDreamsheetFk());
		}
		
		return _dreamsheet;
	}
	
}
