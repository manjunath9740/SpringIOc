package com.seleniumexpress.Ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling using vodafone mobile");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("browsing using vodafone sim ");
	}

}
