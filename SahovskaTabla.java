package predavanje7;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite koordinate za belu figuru");
		int bx = sc.nextInt();
		int by = sc.nextInt();
		System.out.println("Unesite koordinate za crnu kraljicu");
		int cx = sc.nextInt();
		int cy = sc.nextInt();
		
		if (dama(bx, by, cx, cy) == true) System.out.println("NOMNOM");
		else System.out.println("NE");
	}
	
	static boolean dama (int bx, int by, int cx, int cy) {
		if (bx==cx && by==cy) return false; 
		else if (bx==cx || by==cy || bx+by==cx+cy || bx-by==cx-cy) return true;
		else return false;
	}
}
