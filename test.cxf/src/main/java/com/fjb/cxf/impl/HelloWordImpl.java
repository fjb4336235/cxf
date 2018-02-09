package com.fjb.cxf.impl;

import com.fjb.cxf.HelloWord;

public class HelloWordImpl implements HelloWord{

	@Override 
	public String sayHi(String text){
		// TODO Auto-generated method stub
		System.out.println("hello " + text);
		return "hello" + text;
	}

}
