package com.coderby.myapp.toy.service;

import org.springframework.stereotype.Component;

@Component
public class BatteryLog {
	public static void checkBattery() {
		System.out.println( ((int)Math.random()*99+1) + "% ���ҽ��ϴ�.");		
	}
}