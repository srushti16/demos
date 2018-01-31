package com.revature.screens;

import java.util.Scanner;

import com.revature.beans.Tiger;
import com.revature.util.ZooSerializer;

public class AddMammalScreen implements Screen {
	private Scanner scan = new Scanner(System.in);
	private ZooSerializer zs = new ZooSerializer();

	@Override
	public Screen prompt() {
		System.out.println("Please select an option: ");
		System.out.println("Enter 1 to add a tiger");
		System.out.println("Enter 2 to add a dolphin");
		String input = scan.nextLine();
		switch (input) {
		case "1":
			addTiger();
			break;
		case "2":

			break;
		default:
			break;
		}
		return new MainMenu();
	}

	private void addTiger() {
		System.out.println("Enter the tigers hair color: ");
		String hairColor = scan.nextLine();
		System.out.println("Enter the tigers claw sharpness on a scale from 1 to 10: ");
		int clawSharpness = 0;
		try {
			clawSharpness = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Invalid input, tiger now had unsharp claws");
		}

		Tiger t = new Tiger(clawSharpness, hairColor);
		zs.addMammal(t);
		System.out.println("Tiger added");
	}

}
