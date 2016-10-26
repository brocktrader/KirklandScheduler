package com.KirklandScheduler.Wrappers;

import java.util.ArrayList;
import java.util.List;
import com.KirklandScheduler.DataRepositories.CallRepository;
import com.KirklandScheduler.Models.Dreamsheet;

public class DreamsheetWrapper extends Dreamsheet {
	
	private CallRepository callRepository;
	private List<CallWrapper> _calls;
	
	public DreamsheetWrapper() {
		callRepository = new CallRepository();
		
		_calls = new ArrayList<CallWrapper>();
	}
	
	public List<CallWrapper> getCalls(){
		if(_calls.isEmpty()){
			_calls = callRepository.getCallsByDreamsheetFk(this.getDreamsheetPk());
		}
		
		return _calls;
	}
}
