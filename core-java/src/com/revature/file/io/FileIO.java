package com.revature.file.io;

import java.util.Scanner;

import com.revature.beans.Cereal;

public class FileIO {
	public static void main(String[] args) {
		FileIOUtility fileUtil = new FileIOUtility();
		CerealSerializer cs = new CerealSerializer();
		
		// Cereal c = new Cereal("cardboard box", 27, true, "lucky charms");
		// cs.SerializeCereal(c, c.getName() + ".txt");

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the file for the cereal you are looking for: ");
		String input = scan.nextLine();
		Cereal c = cs.DeserializeCereal(input);
		System.out.println("your cereal is: " + c);
		
		

		// call the methods for FileInputStream and FileOutputStream
		// byte b = 5;
		// fileUtil.writeByte(b);

		// System.out.println(fileUtil.readByte());

		// call the methods for FileReader and FileWritter
		// fileUtil.writeChar("hello");

		// System.out.println(fileUtil.readString());

		// call the methods for BufferedReader and BufferedWriter
		// fileUtil.writeLine("hello world");
		// System.out.println(fileUtil.readLine(3));

	}
}
