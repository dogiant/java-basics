package com.dogiant.core.l1;

public class MyResource1 implements AutoCloseable {
	
	public MyResource1() {
		super();
		System.out.println("Constructor : MyResource1 ");
	}

	public void dosth(){
		System.out.println("Do sth : MyResouce1");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Close : MyResouce1");
	}

}
