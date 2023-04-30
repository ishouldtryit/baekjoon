package beakjoonStep004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class no_04_2562 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Integer> list = new ArrayList<>();
			
		int max = 0;
		int maxNo = 0;
		for(int i=1; i<=9; i++ ) {
			list.add(Integer.parseInt(br.readLine()));
		}

		for(int a=0; a<list.size(); a++) {
			if(max<list.get(a)) {
				max = list.get(a);
				maxNo = a+1;
			}
		}
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(maxNo));
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
