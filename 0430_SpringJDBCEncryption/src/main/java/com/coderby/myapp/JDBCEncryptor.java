package com.coderby.myapp;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JDBCEncryptor {
	public static void main(String[] args) {
		StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();
		enc.setPassword("ansdmsghks");
		System.out.println("oracle.jdbc.driver.OracleDriver");
		System.out.println("jdbc:oracle:thin:@localhost:1521:xe");
		System.out.println("hr");
		System.out.println("hr");
	}
}
