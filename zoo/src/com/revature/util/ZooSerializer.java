package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.revature.beans.Mammal;

public class ZooSerializer {

	// public static void main(String[] args) {
	// ZooSerializer zs = new ZooSerializer();
	// zs.serializeZoo(new Mammal[0]);
	// }

	public void serializeZoo(Mammal[] mammals) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("zoo.txt"))) {
			os.writeObject(mammals);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addMammal(Mammal m) {
		Mammal[] mammals = getMammals();

		Mammal[] newMammals = new Mammal[mammals.length + 1];

		for (int i = 0; i < mammals.length; i++) {
			newMammals[i] = mammals[i];
		}
		newMammals[mammals.length] = m;
		serializeZoo(newMammals);
	}

	public Mammal[] getMammals() {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("zoo.txt"))) {
			return (Mammal[]) is.readObject();
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
