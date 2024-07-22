package LAB2_Problem_2;

import java.util.Arrays;
import java.util.Scanner;

public class currency_Payment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Input the size of currency denominations
		System.out.println("Enter the size of currency denominations");
		int size = scanner.nextInt();

		// Input the currency denominations
		System.out.println("Enter the currency denominations value");
		int[] denominations = new int[size];
		for (int i = 0; i < size; i++) {
			denominations[i] = scanner.nextInt();
		}

		// Sort the denominations in descending order
		Arrays.sort(denominations);
		reverseArray(denominations);

		// Input the amount to pay
		System.out.println("Enter the amount you want to pay");
		int amountToPay = scanner.nextInt();

		// Calculate the minimum number of notes needed
		int[] notesCount = new int[size];
		for (int i = 0; i < size; i++) {
			notesCount[i] = amountToPay / denominations[i];
			amountToPay %= denominations[i];
		}

		// Display the result
		System.out.println("Your payment approach in order to give the minimum number of notes will be");
		for (int i = 0; i < size; i++) {
			if (notesCount[i] > 0) {
				System.out.println(denominations[i] + ":" + notesCount[i]);
			}
		}
		scanner.close();
	}


	// Utility method to reverse an array
	private static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;

		while (start < end) {
			// Swap elements at start and end
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			// Move to the next pair
			start++;
			end--;
		}
	}

}
