package beakjoonStep002;

import java.util.Scanner;

public class Step006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cookTime = sc.nextInt();
		
		int time = hour*60+min;
		int finishTime = time+cookTime;
		
		if(finishTime>=1440) {
			finishTime -= 1440;
		}
		
		System.out.println(finishTime/60);
		System.out.println(finishTime%60);
		
		sc.close();
	}
}
