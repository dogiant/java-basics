package com.dogiant.core.l1;

public class MyResource2 implements AutoCloseable {

	public MyResource2() {
		super();
		System.out.println("Constructor : MyResouce2");
	}
	
	public void dosth(){
		System.out.println("Do sth: MyResouce2");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Close : MyResouce2");
	}

}
