	package beakjoonStep004;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
	
	public class no_09_10811 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			String[] inputs = input.split(" ");
			int n = Integer.parseInt(inputs[0]);
			int m = Integer.parseInt(inputs[1]);
			ArrayList<Integer> list = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			for(int a=1; a<=n; a++) {
				list.add(a);
			}
			
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
