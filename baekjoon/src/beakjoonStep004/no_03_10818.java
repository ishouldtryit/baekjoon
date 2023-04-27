package beakjoonStep004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class no_03_10818 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		String input2 = br.readLine();
		String [] inputs2 = input2.split(" ");
		int min=Integer.parseInt(inputs2[0]);
		int max=Integer.parseInt(inputs2[0]);
		
		for(int i=0; i<a; i++) {
			if(Integer.parseInt(inputs2[i])>max) {
				max = Integer.parseInt(inputs2[i]);
			}
		}
		for(int i=0; i<a; i++) {
			if(Integer.parseInt(inputs2[i])<min) {
				min = Integer.parseInt(inputs2[i]);
			}
		}

		bw.write(String.valueOf(min+" "+max));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
