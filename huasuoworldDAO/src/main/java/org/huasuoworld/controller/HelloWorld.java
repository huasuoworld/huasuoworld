package org.huasuoworld.controller;

import java.util.UUID;

import org.huasuoworld.common.po.User;
import org.huasuoworld.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	@Autowired
	UserDAO userDAO;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!" + "-------";
	}
	
	@RequestMapping("/selectByPrimaryKey")
	@ResponseBody
	String selectByPrimaryKey() {
		return "Hello World!" + "-------" + userDAO.selectByPrimaryKey("");
	}

	@RequestMapping("/insert")
	@ResponseBody
	String insert() {
		User user = new User();
		user.setID(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setAddress("testAddress");
		user.setCity("testCity");
		user.setDepartment("testDepartment");
		user.setFirstName("hua");
		user.setLastName("suoworld");
		userDAO.insert(user);
		return "insert successful!" + "-------";
	}
}
