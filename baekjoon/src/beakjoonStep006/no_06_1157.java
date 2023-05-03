package beakjoonStep006;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
	
	public class no_06_1157{
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine().toUpperCase();
			char[] c = new char[input.length()];
			for(int a=0; a<input.length(); a++) {
				c[a] = input.charAt(a);
			}
			
			
			
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
