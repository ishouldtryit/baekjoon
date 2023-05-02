package beakjoonStep006;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
	
	public class no_04_10812{
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			String input2 = null;
			String [] inputs = input.split(" ");
			String [] inputs2=null;
			int n = Integer.parseInt(inputs[0]);
			int m = Integer.parseInt(inputs[1]);
			int i =0;
			int j =0;
			int k =0;
			List<Integer> list = new ArrayList<>();
			int temp=0;
			for(int a=1; a<=n; a++) {
				list.add(a);
			}
			for(int b=0; b<m; b++) {
				inputs2 = null;
				input2=br.readLine();
				inputs2=input2.split(" ");
				i = Integer.parseInt(inputs2[0]);
				j = Integer.parseInt(inputs2[1]);
				k = Integer.parseInt(inputs2[2]);

				temp = list.get(k-1);
				for(int c=0; c<j-k; c++) {
					list.set(k-1+c, list.get(k+c));
				}
				list.set(j-1, temp);
			}
			
			for(int x=0; x<list.size(); x++) {
				bw.write(String.valueOf(list.get(x)));
			}
			
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
