package summationcalculation;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SummationCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int value = 0;

		System.out.print("Enter an integer summation or 0 to exit. The summation value must be greater than 0 or less than 128: ");
		
		try {
			value = sc.nextInt();

			while (value > 0 && value < 128 || value < 0 || value >= 128) {

				int[] questionsNumber = { 1, 2, 4, 8, 16, 32, 64 };
				int[] summationResult = new int[7];
				int auxValue = 0;

				if (value >= questionsNumber[6]) {
					auxValue += questionsNumber[6];
					summationResult[6] = questionsNumber[6];
				}
				if (value >= auxValue + questionsNumber[5]) {
					auxValue += questionsNumber[5];
					summationResult[5] = questionsNumber[5];
				}
				if (value >= auxValue + questionsNumber[4]) {
					auxValue += questionsNumber[4];
					summationResult[4] = questionsNumber[4];
				}
				if (value >= auxValue + questionsNumber[3]) {
					auxValue += questionsNumber[3];
					summationResult[3] = questionsNumber[3];
				}
				if (value >= auxValue + questionsNumber[2]) {
					auxValue += questionsNumber[2];
					summationResult[2] = questionsNumber[2];
				}
				if (value >= auxValue + questionsNumber[1]) {
					auxValue += questionsNumber[1];
					summationResult[1] = questionsNumber[1];
				}
				if (value >= auxValue + questionsNumber[0]) {
					auxValue += questionsNumber[0];
					summationResult[0] = questionsNumber[0];
				}

				if (value > 0 && value < 128) {
					System.out.println();
					System.out.println("|||||||||| Valor digitado (" + value + ") | Somatória: " + summationResult[0]
							+ ", " + summationResult[1] + ", " + summationResult[2] + ", " + summationResult[3] + ", "
							+ summationResult[4] + ", " + summationResult[5] + ", " + summationResult[6]
							+ ". ||||||||||");
				} else {
					System.out.println();
					System.out.println("|||||||||| Value outside the summation range. ||||||||||");
				}
				System.out.printf("%n%n%n");
				System.out.print("Enter an integer summation or 0 to exit. The summation value must be greater than 0 or less than 128: ");
				value = sc.nextInt();
			}
			if (value == 0) {
				System.out.println();
				System.out.println("|||||||||| You typed 0 to exit... Done! ||||||||||");
			}
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("|||||||||| It cannot be letters, fractional numbers, special characters and symbols. Your program has ended. ||||||||||");
		}
		sc.close();
	}
}