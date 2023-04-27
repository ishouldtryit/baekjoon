package beakjoonStep004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class no_01_10807 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		int count = 0;
		String input = br.readLine();
		String [] inputs = input.split(" ");
		int v = Integer.parseInt(br.readLine());
		
		for(int a=0; a<testCase; a++) {
			if(Integer.parseInt(inputs[a])==v) {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
