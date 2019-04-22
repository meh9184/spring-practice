package com.coderby.myapp.toy.controller;
import com.coderby.myapp.toy.service.IBattery;

public class ToyController {
	IBattery battery;
	
	public ToyController(IBattery battery) {
		this.battery = battery;
	}
	
	public void playToy() {
		System.out.println("�峭���� ������ ��ϴ�.");
		battery.useBattery();
	}
}
