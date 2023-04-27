package beakjoonStep003;

import java.util.Scanner;

public class no_04_25304 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int totalPrice = sc.nextInt();
		int items = sc.nextInt();
		int checkPrice=0;
		
		for(int i=0; i<items; i++) {
			int price=sc.nextInt();
			int count=sc.nextInt();
			int result = price*count;
			checkPrice += result;
		}
		if(totalPrice == checkPrice) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}
}
