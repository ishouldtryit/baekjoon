package beakjoonStep002;

import java.util.Scanner;

public class Step007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		
		boolean oneTwo = one==two;
		boolean oneThree = one==three;
		boolean twoThree = two==three;
		
		boolean role1 = oneTwo && oneThree;
		boolean role2 = oneTwo || oneThree || twoThree;
		boolean role3 = !role2;
		
		int money1 = 10000+(one*1000);
//		int money2 = 1000+()
		
		if(role1) {
			
			
		}
				
		
		
		sc.close();
	}
}
