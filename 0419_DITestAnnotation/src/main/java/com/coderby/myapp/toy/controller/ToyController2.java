package com.coderby.myapp.toy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.coderby.myapp.toy.service.IBattery;

@Controller
public class ToyController2 {
	@Autowired
	@Qualifier("enerBattery")
	IBattery battery;
	
	public void playToy() {
		System.out.println("장난감을 가지고 놉니다.");
		battery.useBattery();
	}
}
