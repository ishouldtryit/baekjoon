	package beakjoonStep004;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
	
	public class no_10_1546 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			int n = Integer.parseInt(input);

			String input2 = br.readLine();
			String[] inputs2 = input2.split(" ");
			List<Integer> list2 = new ArrayList<>();
					
			for(String s : inputs2) {
				list2.add(Integer.parseInt(s));
			}
			
			int max = Collections.max(list2);
			
			double sub =0;
			for(int a=0; a<n; a++) {
			 sub += (double)list2.get(a)/max*100;
			}
			double result= sub/n;
			bw.write(String.valueOf(result));
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
