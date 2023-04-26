package beakjoonStep003;

import java.util.Scanner;

public class Step005 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		
		for(int i=0; i<number/4; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
		sc.close();
	}
}
