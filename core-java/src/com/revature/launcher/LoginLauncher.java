package com.revature.launcher;

import com.revature.exceptions.InvalidCredentialException;

public class LoginLauncher {
	public static void main(String[] args) {
		try {
			System.out.println("attempting to login");
			login("blake", "pass");
		} catch (InvalidCredentialException e) {
			System.out.println("failed to login");
		}
	}

	private static void login(String username, String password) throws InvalidCredentialException {
		throw new InvalidCredentialException();
	}
}
