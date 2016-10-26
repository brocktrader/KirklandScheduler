package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class CallLink extends BaseModel {
	//region Variables
	private Guid _callLinkPk;
	private Guid _callOnePk;
	private Guid _callTwoPk;
	//endregion

	//region Constructors
	public CallLink() { super(false); }
	
	public CallLink(Guid callLinkPk, Guid callOnePk, Guid callTwoPk, boolean isFromDatabase) {
		super(isFromDatabase);
		_callLinkPk = callLinkPk;
		_callOnePk = callOnePk;
		_callTwoPk = callTwoPk;
	}
	//endregion

	//region Methods

	public Guid getCallLinkPk() {
		return _callLinkPk;
	}

	public void setCallLinkPk(Guid callLinkPk) {
		_callLinkPk = callLinkPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);
	}

	public Guid getCallOneFk() {
		return _callOnePk;
	}

	public void setCallOneFk(Guid callOnePk) {
		_callOnePk = callOnePk;
		setIsChanged(true);
	}

	public Guid getCallTwoFk() {
		return _callTwoPk;
	}

	public void setCallTwoFk(Guid callTwoPk) {
		_callTwoPk = callTwoPk;
		setIsChanged(true);
	}

	//endregion
}
