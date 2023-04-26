package beakjoonStep001;

import java.util.Scanner;

public class Step010 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int bb = b/100;
		int bbb = (b-((b/100)*100))/10;
		int bbbb = b-(((b/100)*100)+(((b-((b/100)*100))/10)*10));
		
		System.out.println(a*bbbb);
		System.out.println(a*bbb);
		System.out.println(a*bb);
		System.out.println(a*bbbb+(a*bbb*10)+(a*bb*100));

		sc.close();
	}
}
