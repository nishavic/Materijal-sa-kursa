package predavanje5;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljeni broj:");
		int n = sc.nextInt();
		int ost = 0;
		int sumaParnih = 0;
		int sumaNeparnih = 0;

		while (n > 0) {
			ost = n % 10;
			if (ost % 2 == 0) {
				sumaParnih += ost;
			} else {
				sumaNeparnih += ost;
			}
			n /= 10;
		}
		
		int razlika = sumaParnih - sumaNeparnih;
		System.out.println("Razlika parnih i neparnih cifara ovog broja je " + razlika + ".");
	}
}
