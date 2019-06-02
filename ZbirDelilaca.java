package predavanje9;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = sc.nextInt();
		int rezultat = zbirDelilaca(n);
		System.out.println("Zbir delilaca broja " + n + " je " + rezultat + ".");
	}
	
	static int zbirDelilaca (int a) {
		int sum = 0;
		for (int i=1; i<=a; i++) {
			if (a%i==0) {
				sum += i;
			}
		}
		return sum;
	}
}
