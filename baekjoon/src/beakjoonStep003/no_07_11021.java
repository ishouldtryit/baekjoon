package beakjoonStep003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no_07_11021 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=testCase; i++) {
			String inputCase = br.readLine();
			String[] inputCases = inputCase.split(" ");
			
			int a = Integer.parseInt(inputCases[0]);
			int b = Integer.parseInt(inputCases[1]);
			
			bw.write("Case #"+i+": "+(a+b));
			bw.newLine();
		}

		bw.flush();
		
	}
}
