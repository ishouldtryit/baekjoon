package beakjoonStep003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no_09_2438 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=testCase; i++) {
			for(int a=1; a<=i; a++) {
				bw.write("*");
			}
			
			bw.newLine();
		}
		bw.flush();
	}
}
