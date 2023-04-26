package beakjoonStep003;

import java.util.Scanner;

public class Step003 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int total=0;
		for(int i=1; i<=caseNum; i++) {
			total+=i;
		}
		System.out.println(total);
		
		sc.close();
	}
}
