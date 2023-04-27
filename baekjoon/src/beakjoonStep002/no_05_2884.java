package beakjoonStep002;

import java.util.Scanner;

public class no_05_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		boolean a = num1>0&&num2>0;
		boolean b = num1<0&&num2>0;
		boolean c = num1<0&&num2<0;
		boolean d = num1>0&&num2<0;

		
		if(a) {
			System.out.println(1);
		}else if(b) {
			System.out.println(2);
		}else if(c) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
		
		
		sc.close();
	}
}
