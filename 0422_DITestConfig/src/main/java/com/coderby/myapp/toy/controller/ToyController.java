package com.coderby.myapp.toy.controller;
import com.coderby.myapp.toy.service.IBattery;

public class ToyController {
	IBattery battery;
	
	public ToyController(IBattery battery) {
		this.battery = battery;
	}
	
	public void playToy() {
		System.out.println("장난감을 가지고 놉니다.");
		battery.useBattery();
	}
}
