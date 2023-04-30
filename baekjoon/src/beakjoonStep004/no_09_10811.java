	package beakjoonStep004;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
	
public class no_09_10811 {
	
	public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			String[] inputs = input.split(" ");
			int n = Integer.parseInt(inputs[0]);
			int m = Integer.parseInt(inputs[1]);
			ArrayList<Integer> list = new ArrayList<>();
			for(int a=1; a<=n; a++) {
				list.add(a);
			}
			
			String input2=null;
			String[] inputs2=null;
			int i=0;
			int j=0;
			for(int b=0; b<m; b++) {
				input2 = br.readLine();
				inputs2 = input2.split(" ");
				i = Integer.parseInt(inputs2[0]);
				j = Integer.parseInt(inputs2[1]);
				if(i!=j) {
					ArrayList<Integer> list2 = new ArrayList<>(list.subList(i-1, j));
					Collections.reverse(list2);
					for(int c=0; c<list2.size(); c++) {
						list.set(i-1+c, list2.get(c));
					}
				}
			}
			for(int d=0; d<list.size(); d++) {
				bw.write(list.get(d)+" ");
			}
			
			
			bw.flush();
			bw.close();
			br.close();
		}
	}