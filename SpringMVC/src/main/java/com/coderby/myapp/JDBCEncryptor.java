package com.coderby.myapp;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JDBCEncryptor {
	
	public static void main(String[] args) {
		StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();
		enc.setPassword("qwerasdf");
		System.out.println(enc.encrypt("oracle.jdbc.driver.OracleDriver"));//드라이버
		System.out.println(enc.encrypt("jdbc:oracle:thin:@localhost:1521:xe"));//url
		System.out.println(enc.encrypt("hr"));//id
		System.out.println(enc.encrypt("hr"));//pw
		
	}
	
}
