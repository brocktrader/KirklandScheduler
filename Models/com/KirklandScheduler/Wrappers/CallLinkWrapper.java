package com.KirklandScheduler.Wrappers;

import java.util.ArrayList;
import java.util.List;

import com.KirklandScheduler.DataRepositories.CallLinkRepository;
import com.KirklandScheduler.DataRepositories.CallRepository;
import com.KirklandScheduler.Models.CallLink;
import com.KirklandScheduler.Utilities.Guid;

public class CallLinkWrapper extends CallLink {

	private CallRepository callRepository;
	private CallLinkRepository callLinkRepository;
	private List<CallWrapper> _linkedCalls;
	private CallWrapper _callOne;
	private CallWrapper _callTwo;
	
	public CallLinkWrapper() {
		callRepository = new CallRepository();
		callLinkRepository = new CallLinkRepository();
		
		_linkedCalls = new ArrayList<CallWrapper>();
		_callOne = null;
		_callTwo = null;
	}
	
	public CallWrapper getCallOne(){
		if(_callOne == null){
			_callOne = callRepository.getByPk(this.getCallOneFk());
		}
		
		return _callOne;
	}
	
	public CallWrapper getCallTwo(){
		if(_callTwo == null){
			_callTwo = callRepository.getByPk(this.getCallTwoFk());
		}
		
		return _callTwo;
	}

	public List<CallWrapper> getLinkedCalls(Guid callFk){
		
		if(_linkedCalls.isEmpty())
			_linkedCalls = callLinkRepository.getLinkedCallsByCallFk(callFk);
		
		return _linkedCalls;
	}
	
}
