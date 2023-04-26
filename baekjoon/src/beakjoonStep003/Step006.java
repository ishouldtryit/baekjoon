package beakjoonStep003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step006 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
		
			String insert = br.readLine();
			String[] insertArray = insert.split(" ");
			int a = Integer.parseInt(insertArray[0]);
			int b = Integer.parseInt(insertArray[1]);
			bw.write(String.valueOf(a+b));
			bw.newLine();
		}
		bw.flush();
	}
}
