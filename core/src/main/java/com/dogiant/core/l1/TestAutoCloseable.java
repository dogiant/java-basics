package com.dogiant.core.l1;

public class TestAutoCloseable {

	public static void main(String[] args) {
		try (MyResource1 myResource1 = new MyResource1();
				MyResource2 myResource2 = new MyResource2()) {
			myResource1.dosth();
			myResource2.dosth();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
