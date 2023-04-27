package beakjoonStep004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class no_02_10871 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine();
		String [] inputs1 = input1.split(" ");
		int n = Integer.parseInt(inputs1[0]);
		int x = Integer.parseInt(inputs1[1]);
		String input2 = br.readLine();
		String [] inputs2 = input2.split(" ");
		String output=" ";
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(inputs2[i])<x) {
				String write = String.valueOf(inputs2[i]+" ");
				output += write;
			}
		}
		String result = output.substring(1, output.length()-1);
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}
