package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class Employee extends BaseModel 
{	
	//region Variables
	private Guid _empPk;
	private Guid _titleFk;
	private String _firstName;
	private String _lastName;
	private String _email;
	private String _phone;
	private boolean _isPreferred;
	private boolean _isActive = true;	
	//endregion
	
	//region Constructors
	public Employee() { super(false); }
	
	public Employee(Guid empPk, Guid titleFk, String firstName, String lastName, String email, String phone,
			boolean isPreferred, boolean isActive, boolean isFromDatabase) {
		super(isFromDatabase);
		_empPk = empPk;
		_titleFk = titleFk;
		_firstName = firstName;
		_lastName = lastName;
		_email = email;
		_phone = phone;
		_isPreferred = isPreferred;
		_isActive = isActive;
	}
	//endregion
	
	//region Methods
	public Guid getEmpPk() {
		return _empPk;
	}
	public void setEmpPk(Guid empPk) {
		_empPk = empPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);		
	}
	public Guid getTitleFk() {
		return _titleFk;
	}
	public void setTitleFk(Guid titleFk) {
		_titleFk = titleFk;
		setIsChanged(true);		
	}
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String firstName) {
		_firstName = firstName;
		setIsChanged(true);		
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String lastName) {
		_lastName = lastName;
		setIsChanged(true);		
	}
	public String getEmail() {
		return _email;
	}
	public void setEmail(String email) {
		_email = email;
		setIsChanged(true);
	}
	public String getPhone() {
		return _phone;
	}
	public void setPhone(String phone) {
		_phone = phone;
		setIsChanged(true);
	}
	public boolean getIsPreferred() {
		return _isPreferred;
	}
	public void setIsPreferred(boolean isPreferred) {
		_isPreferred = isPreferred;
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
