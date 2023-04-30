	package beakjoonStep005;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_01_27866 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			int input2 = Integer.parseInt(br.readLine());
			
			char c = input.charAt(input2-1);
			bw.write(c);
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
