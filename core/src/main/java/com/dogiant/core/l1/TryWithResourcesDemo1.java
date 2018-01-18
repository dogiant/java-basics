package com.dogiant.core.l1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResourcesDemo1 {

	public static void main(String[] args) {

		try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {

			writer.println("Hello World");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
