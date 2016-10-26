package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class Dreamsheet extends BaseModel {
	//region Variables
	private Guid _dreamsheetPk;
	private boolean _isCurrentDreamsheet;
	private boolean _isActive;
	//endregion

	//region Constructors
	public Dreamsheet() { super(false); }
	
	public Dreamsheet(Guid dreamsheetPk, boolean isCurrentDreamsheet, boolean isActive, boolean isFromDatabase) {
		super(isFromDatabase);
		_dreamsheetPk = dreamsheetPk;
		_isCurrentDreamsheet = isCurrentDreamsheet;
		_isActive = isActive;
	}
	//endregion

	//region Methods
	public Guid getDreamsheetPk() {
		return _dreamsheetPk;
	}

	public void setDreamsheetPk(Guid dreamsheetPk) {
		_dreamsheetPk = dreamsheetPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);
	}

	public boolean getIsCurrentDreamsheet() {
		return _isCurrentDreamsheet;
	}

	public void setIsCurrentDreamsheet(boolean isCurrentDreamsheet) {
		_isCurrentDreamsheet = isCurrentDreamsheet;
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
