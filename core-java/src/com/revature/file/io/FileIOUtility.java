package com.revature.file.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOUtility {

	public void writeByte(byte b) {
		// try with resources, anything in the () of the try will be automatically
		// closed after the try catch execution
		try (FileOutputStream fos = new FileOutputStream("test.txt")) {
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {
			System.out.println("unable to write to file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("an error occured while writting");
			e.printStackTrace();
		}
	}

	public int readByte() {
		try (FileInputStream fis = new FileInputStream("test.txt")) {
			return fis.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public void writeChar(String s) {
		try (FileWriter fw = new FileWriter("file-writter.txt")) {
			fw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * At this point this method reads the entire file, byte by byte
	 * 
	 * @return -1 if it read the whole file, or 0 if an exception occurred
	 */
	public char readString() {
		try (FileReader fr = new FileReader("file-writter.txt")) {
			int next = fr.read();
			while (next != -1) {
				System.out.print((char) next);
				next = fr.read();
			}
			return (char) next;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public void writeLine(String s) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"))) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Reads the requested line from the file.
	 * 
	 * @param lineNumber the line we want to read indexed from 0
	 * @return the line read as a string
	 */
	public String readLine(int lineNumber) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {
			for(int i = 0; i < lineNumber; i++) {
				br.readLine();
			}
			return br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
