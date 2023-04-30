package beakjoonStep004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no_05_10810 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		String []inputs = input.split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		int[] list = new int[n];

		
		for(int a=0; a<m; a++) {
			String input2 = br.readLine();
			String [] inputs2 = input2.split(" ");
			int i = Integer.parseInt(inputs2[0])-1;
			int j = Integer.parseInt(inputs2[1])-1;
			int k = Integer.parseInt(inputs2[2]);
			
			for(int b=i; b<=j; b++) {
				list[b] = k;
			}
		}
			
		for(int c=0; c<n; c++) {
			bw.write(list[c]+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
