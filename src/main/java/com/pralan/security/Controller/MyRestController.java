package com.pralan.security.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pralan.security.Service.MyService;

@RestController
@RequestMapping("/api/v1/mycontroller")
public class MyRestController {
	
	@Autowired
	MyService myService;
	
	@RequestMapping( value = "/getNameList", method = RequestMethod.GET)
	List<String> getNameList(@RequestParam int id){
		return myService.getNameList(id);
	}
	
	@RequestMapping( value = "/getAdminList", method = RequestMethod.GET)
	List<String> getAdminList(@RequestParam int id){
		return myService.getAdminList(id);
	}

}
