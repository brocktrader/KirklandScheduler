package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class Employee extends BaseModel {
	// region Variables
	private String _email;
	private String _employeeId;
	private Guid _empPk;
	private String _firstName;
	private boolean _isActive = true;
	private boolean _isPreferred;
	private String _lastName;
	private String _phone;
	private Guid _titleFk;
	// endregion

	// region Constructors
	public Employee() {
		super(false);
	}

	public Employee(Guid empPk, Guid titleFk, String employeeId, String firstName, String lastName, String email,
			String phone, boolean isPreferred, boolean isActive, boolean isFromDatabase) {
		super(isFromDatabase);
		this._empPk = empPk;
		this._titleFk = titleFk;
		this._employeeId = employeeId;
		this._firstName = firstName;
		this._lastName = lastName;
		this._email = email;
		this._phone = phone;
		this._isPreferred = isPreferred;
		this._isActive = isActive;
	}
	// endregion

	public String getEmail() {
		return this._email;
	}

	public String getEmployeeId() {
		return this._employeeId;
	}

	// region Methods
	public Guid getEmpPk() {
		return this._empPk;
	}

	public String getFirstName() {
		return this._firstName;
	}

	public boolean getIsActive() {
		return this._isActive;
	}

	public boolean getIsPreferred() {
		return this._isPreferred;
	}

	public String getLastName() {
		return this._lastName;
	}

	public String getPhone() {
		return this._phone;
	}

	public Guid getTitleFk() {
		return this._titleFk;
	}

	public void setEmail(String email) {
		this._email = email;
		this.setIsChanged(true);
	}

	public void setEmployeeId(String employeeId) {
		this._employeeId = employeeId;
		this.setIsChanged(true);
	}

	public void setEmpPk(Guid empPk) {
		this._empPk = empPk;

		this.setIsChanged(true);
		this.setIsFromDatabase(false);
	}

	public void setFirstName(String firstName) {
		this._firstName = firstName;
		this.setIsChanged(true);
	}

	public void setIsActive(boolean isActive) {
		this._isActive = isActive;
		this.setIsChanged(true);
	}

	public void setIsPreferred(boolean isPreferred) {
		this._isPreferred = isPreferred;
		this.setIsChanged(true);
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
		this.setIsChanged(true);
	}

	public void setPhone(String phone) {
		this._phone = phone;
		this.setIsChanged(true);
	}

	public void setTitleFk(Guid titleFk) {
		this._titleFk = titleFk;
		this.setIsChanged(true);
	}

	// endregion
}
