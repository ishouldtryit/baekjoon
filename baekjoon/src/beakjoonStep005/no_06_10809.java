package beakjoonStep005;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_06_10809 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int input = Integer.parseInt(br.readLine());
			String input2 = br.readLine();
			int sub =0;
			for(int a=0; a<input; a++) {
				sub += Integer.parseInt(String.valueOf(input2.charAt(a)));
			}
			bw.write(String.valueOf(sub));
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
