package com.coderby.myapp.toy.service;

import org.springframework.stereotype.Service;

@Service
public class EnerBattery implements IBattery {
	@Override
	public void useBattery() {
		System.out.println("����� �������� ������");
	}
}
