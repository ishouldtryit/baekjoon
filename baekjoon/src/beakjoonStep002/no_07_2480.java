package beakjoonStep002;

import java.util.Scanner;

public class no_07_2480 {

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
		
		
		
		if(role1) {
			System.out.println(10000+(one*1000));
		}else if(role2) {
			if(oneTwo||oneThree) {
				System.out.println(1000+(one*100));
			}else {
				System.out.println(1000+(two*100));
			}
		}else {
			if(one>two) {
				if(one>three) {
					System.out.println(one*100);
				}else {
					System.out.println(three*100);
				}
			}else {
				if(two>three) {
					System.out.println(two*100);
				}else {
					System.out.println(three*100);
				}
			}
			
		}
		sc.close();
	}
}
