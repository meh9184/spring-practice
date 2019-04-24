package com.coderby.myapp.toy.service;

public class BatteryLog {
	public static void checkBattery() {
		System.out.println( ( (int)(Math.random() * 99) + 1) +"% 남았습니다.");
	}
}
