package beakjoonStep005;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
	
	public class no_09_2908 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input ," ");
			bw.write(String.valueOf(st.countTokens()));
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
