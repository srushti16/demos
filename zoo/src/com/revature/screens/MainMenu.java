package com.revature.screens;

import java.util.Arrays;
import java.util.Scanner;

import com.revature.util.ZooSerializer;

public class MainMenu implements Screen {
	private Scanner scan = new Scanner(System.in);
	private ZooSerializer zs = new ZooSerializer();

	@Override
	public Screen prompt() {
		System.out.println("Please select an option: ");
		System.out.println("Enter 1 to view all mammal at the zoo");
		System.out.println("Enter 2 to add a new mammal to the zoo");
		System.out.println("Enter 3 to have all mammal sleep");
		String input = scan.nextLine();

		switch (input) {
		case "1":
			System.out.println(Arrays.toString(zs.getMammals()));
			break;
		case "2":
			return new AddMammalScreen();
		case "3":

			break;

		default:
			System.out.println("invalid option");
			break;
		}

		return new MainMenu();
	}

}
