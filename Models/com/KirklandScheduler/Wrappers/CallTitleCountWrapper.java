package com.KirklandScheduler.Wrappers;

import com.KirklandScheduler.DataRepositories.CallRepository;
import com.KirklandScheduler.DataRepositories.TitleRepository;
import com.KirklandScheduler.Models.CallTitleCount;

public class CallTitleCountWrapper extends CallTitleCount {

	private CallRepository callRepository;
	private TitleRepository titleRepository;
	private CallWrapper _call;
	private TitleWrapper _title;
	
	public CallTitleCountWrapper() {
		callRepository = new CallRepository();
		titleRepository = new TitleRepository();
		
		_call = null;
		_title = null;
	}
	
	public CallWrapper getCall(){
		if(_call == null){
			_call = callRepository.getByPk(this.getCallFk());
		}
		
		return _call;
	}
	
	public TitleWrapper getTitle(){
		if(_title == null){
			_title = titleRepository.getByPk(this.getTitleFk());
		}
		
		return _title;
	}

}
