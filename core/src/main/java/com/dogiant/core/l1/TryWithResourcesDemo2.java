package com.dogiant.core.l1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResourcesDemo2 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(new File("text.txt"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try (Scanner scanner = new Scanner(new File("testRead.txt"));
				PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
			while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
