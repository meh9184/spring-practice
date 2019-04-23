package com.coderby.myapp.toy.controller;

import com.coderby.myapp.toy.service.IBattery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ToyController {
	
	@Autowired
	@Qualifier("duraBattery")
	IBattery battery;
	
	public ToyController(IBattery battery) {
		this.battery = battery;
	}
	
	public void playToy() {
		System.out.println("장난감을 가지고 놉니다.");
		battery.useBattery();
	}
}
