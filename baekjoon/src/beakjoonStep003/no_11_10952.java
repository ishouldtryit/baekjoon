package beakjoonStep003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no_11_10952 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
				
		while(true) {
			
			String input = br.readLine();
			String[] inputs = input.split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			if((a+b)==0) {
				break;
			}
			bw.write((String.valueOf(a+b)));
			bw.newLine();
		}
		bw.flush();
	}
}
