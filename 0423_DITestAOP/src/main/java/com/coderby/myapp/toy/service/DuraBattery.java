package com.coderby.myapp.toy.service;
import org.springframework.stereotype.Component;

@Component
public class DuraBattery implements IBattery {
	
	@Override
	public void useBattery() {
		System.out.println("�䳢�� �����ϴ� ������");
	}
}
