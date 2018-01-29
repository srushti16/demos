package com.revature.launcher;

public class ControlLauncher {
	public static void main(String[] args) {
		boolean b = true;
		boolean c = false;

		// can have as manay optional else if statements as we want
		// can lastly have a single else as a catch all if all others
		// fail
		if (b) {
			// do something if b is true
			System.out.println("one");
		} else if (c) {
			// do somehing if b is false and c is true
			System.out.println("two");
		} else {
			// so something if none of the prior conditions have been met
			System.out.println("three");
		}

		// continuously executes until the condition is not met
		while (b) {
			
			b = !b;
			System.out.println("continue");
//			if(b) {
//				continue; // continue will continue to the next iteration and skip the rest of the code for this itteration
							// break will completely stop the loop
//			}
			System.out.println("while");
		}

		// do while always executes at least once because the condition is checked at
		// the end not the start
		do {
			System.out.println("do");
		} while (false);

		// should be used if we know exactly how many times we need to execute
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		String switcher = "hello";
		// if your if statement ends up having a lot of else ifs, you might want to
		// consider a switch
		switch (switcher) {
		case "no":
			System.out.println("no");
			break;

		case "hello":
			System.out.println("hello there");
			break;

		default:
			System.out.println("case did not match any clauses");
			break;
		}

		
		System.out.println("basically an if else " + (false ? "yes": "no"));
		System.out.println("basically an if else " + 
				(
					true // ternary condition
						? "yes" // if true returns this
						: "no"
				) // if false returns this
		);
	}
}
