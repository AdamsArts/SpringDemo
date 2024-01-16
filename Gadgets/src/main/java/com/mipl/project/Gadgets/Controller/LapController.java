package com.mipl.project.Gadgets.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipl.project.Gadgets.Entity.Laptop;
import com.mipl.project.Gadgets.Service.LapInfo;


@RestController
@RequestMapping("/myLaptop")
public class LapController {
	@Autowired
	private LapInfo lapinfo;
	
	@RequestMapping("/laptopList")
	public List<Laptop> lapCollecton(){
		
		return LapInfo.lapCollection();
	}

}
