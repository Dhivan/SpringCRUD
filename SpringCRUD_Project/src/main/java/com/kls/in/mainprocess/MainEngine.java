package com.kls.in.mainprocess;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kls.in.DAOImpl.UserDAOImpl;
import com.kls.in.DAOInterface.UserDAOInterface;
import com.kls.in.model.UserDetails;

@Controller
public class MainEngine {

	private static Logger logger = Logger.getLogger(MainEngine.class);
	@Autowired
	UserDetails userDetails;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String doUserRegistration(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			@RequestParam("fname") String fName, @RequestParam("email") String email,
			@RequestParam("phone") String phone, @RequestParam("gender") String gender,
			@RequestParam("password") String password) {
		logger.info("============ Register Process Invoked =============");
		userDetails.setFirstName(fName);
		userDetails.setEmail(email);
		userDetails.setPhone(phone);
		userDetails.setGender(gender);
		userDetails.setPassword(password);
		UserDAOInterface userInterface = new UserDAOImpl();
		boolean insertFlag = false;

		insertFlag = userInterface.insertUserDetails(userDetails, insertFlag);

		if (insertFlag) {
			logger.info("============ Register Process Successful =============");
			return "home";

		} else {
			logger.info("============ Register Process Failed =============");
			return "index";

		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doUserLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			@RequestParam("email") String email, @RequestParam("password") String password) {

		userDetails.setEmail(email);
		userDetails.setPassword(password);
		UserDAOInterface userInterface = new UserDAOImpl();
		boolean selectFlag = false;
		selectFlag = userInterface.gettUserDetails(userDetails, selectFlag);
		if (selectFlag) {
			logger.info("============ Login Process Successful =============");
			return "home";

		} else {
			logger.info("============ Login Process Failed =============");
			return "login";

		}
	}
	
	@RequestMapping(value = "/employeeInsert", method = RequestMethod.POST)
	public String doEmloyeeRegistration(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			@RequestParam("fname") String fName, @RequestParam("email") String email,
			@RequestParam("phone") String phone, @RequestParam("gender") String gender) {
		logger.info("============ Register Process Invoked =============");
		userDetails.setFirstName(fName);
		userDetails.setEmail(email);
		userDetails.setPhone(phone);
		userDetails.setGender(gender);
		UserDAOInterface userInterface = new UserDAOImpl();
		boolean insertFlag = false;

		insertFlag = userInterface.insertEmployeeDetails(userDetails, insertFlag);

		if (insertFlag) {
			logger.info("============ Register Process Successful =============");
			return "home";

		} else {
			logger.info("============ Register Process Failed =============");
			return "insertEmploye";

		}

	}
	
	
	@RequestMapping(value = "/employeeUpdate", method = RequestMethod.POST)
	public String doEmloyeeUpdate(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			@RequestParam("fname") String fName, @RequestParam("email") String email,
			@RequestParam("phone") String phone, @RequestParam("gender") String gender) {
		logger.info("============ Register Process Invoked =============");
		userDetails.setFirstName(fName);
		userDetails.setEmail(email);
		userDetails.setPhone(phone);
		userDetails.setGender(gender);
		UserDAOInterface userInterface = new UserDAOImpl();
		boolean updatetFlag = false;

		updatetFlag = userInterface.updateEmployeeDetails(userDetails, updatetFlag);

		if (updatetFlag) {
			logger.info("============ Register Process Successful =============");
			return "home";

		} else {
			logger.info("============ Register Process Failed =============");
			return "updateEmploye";

		}

	}

}
