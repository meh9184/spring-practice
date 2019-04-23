package com.coderby.myapp.toy.service;
import org.springframework.stereotype.Component;

@Component
public class DuraBattery implements IBattery {
	
	@Override
	public void useBattery() {
		System.out.println("토끼가 광고하는 건전지");
	}
}
