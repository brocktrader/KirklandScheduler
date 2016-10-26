package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class Title extends BaseModel {

	//region Variables
	private Guid _titlePk;
	private String _code;
	private String _description;
	//endregion

	//region Constructor
	public Title() { super(false); }
	
	public Title(Guid titlePk, String code, String description, boolean isFromDatabase) {
		super(isFromDatabase);
		_titlePk = titlePk;
		_code = code;
		_description = description;
	}
	//endregion
	
	//region Methods
	public Guid getTitlePk() {
		return _titlePk;
	}
	public void setTitlePk(Guid titlePk) {
		_titlePk = titlePk;
		
		setIsChanged(true);
		setIsFromDatabase(false);
	}
	public String getCode() {
		return _code;
	}
	public void setCode(String code) {
		_code = code;
		setIsChanged(true);
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description = description;
		setIsChanged(true);
	}
	//endregion
}
