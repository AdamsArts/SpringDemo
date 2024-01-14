package com.mipl.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipl.project.Entity.Laptop;
import com.mipl.project.Service.LapInfo;
import com.mipl.project.Entity.Laptop;

@RestController
@RequestMapping
public class LapController {
	
	@RequestMapping("/laptop-list")
	public List<Laptop> lapCollecton(){
		
		return LapInfo.lapCollection();
	}

}
