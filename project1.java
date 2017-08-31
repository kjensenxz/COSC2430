/*
 * Kenneth B. Jensen
 * COSC 2430 // Introduction to Computer Science II
 * Section 501
 * Project 1
 *
 * This program simulates the bouncing of an object 
 * with a user-defined V₀ up to five times.
 */

import java.util.Scanner;

public class project1 {
	public static void main(String[] args) {
		int time = 0, bounces = 0;
		double height = 0, velocity = 0; // using an int will result in rounding errors

		Scanner sc = new Scanner(System.in);

		velocity = readDouble("Enter the initial velocity of the ball: ");

		if (velocity == 0f) {
			System.out.println("A ball with no velocity won't bounce!");
			main(args);
		}

		while (bounces < 5) {
			System.out.printf("Time: %d Height: %.1f ft\n", 
				time, height);
			height += velocity;
			velocity -= 32;
			if (height < 0) {
				height *= -0.5;
				velocity *= -0.5;
				bounces++;
				System.out.println("Bounce!");
			}
			time++;
		}
	}

	/*
	 * Create a black-box for grabbing a double from the user.
	 * Uses a try and catch until a valid input is given.
	 * Returns an int. Takes a prompt to deliver to the user.
	 */

	private static double readDouble(String p) {
		Scanner sc = new Scanner(System.in);
		double d = 0; // initialize so the compiler won't bitch on return
		try {
			System.out.print(p);
			d = sc.nextDouble();
		}
		catch (Exception e) {
			System.out.println("Input must be a number.");
			readDouble(p);
		}
		return d;
	}
}
