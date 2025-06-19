package com.spring_boot.sb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
	
	@Autowired
	Currency currency;
	
	@RequestMapping("/currency-config")
	public Currency getCourses(){
		
		return currency;
		
	}

}
