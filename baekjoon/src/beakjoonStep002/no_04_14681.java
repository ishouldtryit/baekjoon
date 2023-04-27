package beakjoonStep002;

import java.util.Scanner;

public class no_04_14681 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int time = hour*60+min;
		int editTime = time-45;
		
		if(editTime<0) {
			editTime += 1440;
		}
		System.out.println(editTime/60);
		System.out.println(editTime%60);
		
		sc.close();
	}
}
