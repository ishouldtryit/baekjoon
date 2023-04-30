package beakjoonStep005;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
	
	public class no_08_1152 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input ," ");
			String reverseA = new StringBuilder(st.nextToken()).reverse().toString();
			String reverseB = new StringBuilder(st.nextToken()).reverse().toString();
			int a = Integer.parseInt(reverseA);
			int b = Integer.parseInt(reverseB);
			if(a>b) {
				bw.write(String.valueOf(a));
			}else {
				bw.write(String.valueOf(b));
				
			}
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
