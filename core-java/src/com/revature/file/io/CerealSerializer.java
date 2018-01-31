package com.revature.file.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.revature.beans.Cereal;

public class CerealSerializer {
	public void SerializeCereal(Cereal c, String fileName) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))) {
			os.writeObject(c);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Cereal DeserializeCereal(String fileName) {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Cereal) is.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
