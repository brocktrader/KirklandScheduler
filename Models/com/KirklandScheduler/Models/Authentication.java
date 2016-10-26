package com.KirklandScheduler.Models;

import com.KirklandScheduler.Utilities.Guid;

public class Authentication extends BaseModel
{	
	//region Variables
	private Guid _authPk;
	private Guid _empFk;
	private String _hash;
	private String _salt;
	private boolean _isUserPass;
	private boolean _isLocked;
	//endregion
	
	//region Constructors
	public Authentication() { super(false); }
	
	public Authentication(Guid authPk, Guid empFk, String hash, String salt, boolean isUserPass,
			boolean isLocked, boolean isFromDatabase) {
		super(isFromDatabase);
		_authPk = authPk;
		_empFk = empFk;
		_hash = hash;
		_salt = salt;
		_isUserPass = isUserPass;
		_isLocked = isLocked;
	}
	//endregion
	
	//region Methods
	public Guid getAuthPk() {
		return _authPk;
	}
	public void setAuthPk(Guid authPk) {
		_authPk = authPk;
		
		setIsChanged(true);
		setIsFromDatabase(false);
	}
	public Guid getEmpFk() {
		return _empFk;
	}
	public void setEmpFk(Guid empFk) {
		_empFk = empFk;
		setIsChanged(true);
	}
	public String getHash() {
		return _hash;
	}
	public void setHash(String hash) {
		_hash = hash;
		setIsChanged(true);
	}
	public String getSalt() {
		return _salt;
	}
	public void setSalt(String salt) {
		_salt = salt;
		setIsChanged(true);
	}
	public boolean getIsUserPass() {
		return _isUserPass;
	}
	public void setIsUserPass(boolean isUserPass) {
		_isUserPass = isUserPass;
		setIsChanged(true);
	}
	public boolean getIsLocked() {
		return _isLocked;
	}
	public void setIsLocked(boolean isLocked) {
		_isLocked = isLocked;
		setIsChanged(true);
	}
	//endregion
}
