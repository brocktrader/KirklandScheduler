package com.KirklandScheduler.Models;

import java.util.Date;

import com.KirklandScheduler.Utilities.Guid;

public class Call extends BaseModel {

	//region Variables
	private Guid _callPk;
	private Guid _dreamsheetFk;
	private String _title;
	private Date _startDateTime;
	private Date _endDateTime;
	private boolean _isCompetencyCall;
	private boolean _isActive;
	//endregion

	//region Constructors
	public Call() { super(false); }
	
	public Call(Guid callPk, Guid dreamsheetFk, String title, Date startDateTime, Date endDateTime,
			boolean isCompetencyCall, boolean isActive, boolean isFromDatabase) {
		super(isFromDatabase);
		_callPk = callPk;
		_dreamsheetFk = dreamsheetFk;
		_title = title;
		_startDateTime = startDateTime;
		_endDateTime = endDateTime;
		_isCompetencyCall = isCompetencyCall;
		_isActive = isActive;
	}
	//endregion

	//region Methods
	public Guid getCallPk() {
		return _callPk;
	}
	public void setCallPk(Guid callPk) {
		_callPk = callPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);
	}
	public Guid getDreamsheetFk() {
		return _dreamsheetFk;
	}
	public void setDreamsheetFk(Guid dreamsheetFk) {
		_dreamsheetFk = dreamsheetFk;
		setIsChanged(true);
	}
	public String getTitle() {
		return _title;
	}
	public void setTitle(String title) {
		_title = title;
		setIsChanged(true);
	}
	public Date getStartDateTime() {
		return _startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		_startDateTime = startDateTime;
		setIsChanged(true);
	}
	public Date getEndDateTime() {
		return _endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		_endDateTime = endDateTime;
		setIsChanged(true);
	}
	public boolean getIsCompetencyCall() {
		return _isCompetencyCall;
	}
	public void setIsCompetencyCall(boolean isCompetencyCall) {
		_isCompetencyCall = isCompetencyCall;
		setIsChanged(true);
	}
	public boolean getIsActive() {
		return _isActive;
	}
	public void setIsActive(boolean isActive) {
		_isActive = isActive;
		setIsChanged(true);
	}
	//endregion
}
