package beakjoonStep003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no_12_10951 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = "";
				
		while((input=br.readLine())!=null) {
			
			
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
		bw.close();
		br.close();
	}
}
