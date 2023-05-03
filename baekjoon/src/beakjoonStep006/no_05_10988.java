package beakjoonStep006;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
	
	public class no_05_10988{
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			char[] c = new char[input.length()];
			for(int a =0; a<input.length(); a++) {
				c[a] = input.charAt(a);
			}
			int count = 0;
			for(int b=0; b<c.length/2; b++) {
				if(c[b] == c[c.length-b-1]) {
					count++;
				}
			}
			if(c.length/2 == count) {
				bw.write("1");
			}else {
				bw.write("0");
			}
			bw.flush();
			bw.close();
			br.close();
		}
	}
