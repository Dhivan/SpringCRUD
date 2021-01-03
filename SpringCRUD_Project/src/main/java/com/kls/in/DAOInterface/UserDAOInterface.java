package com.kls.in.DAOInterface;

import com.kls.in.model.UserDetails;

public interface UserDAOInterface {
	
	public abstract boolean insertUserDetails(UserDetails userDetails, boolean insertFlag);
	
	public abstract boolean gettUserDetails(UserDetails userDetails,boolean selectFlag);
	
	public abstract boolean insertEmployeeDetails(UserDetails userDetails,boolean inserttFlag);
	
	public abstract boolean updateEmployeeDetails(UserDetails userDetails,boolean inserttFlag);

}
