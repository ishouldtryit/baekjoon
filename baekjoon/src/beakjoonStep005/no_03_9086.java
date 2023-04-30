	package beakjoonStep005;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_03_9086 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int input = Integer.parseInt(br.readLine());
			String input2=null;
			for(int a=0; a<input; a++) {
				input2 = br.readLine();
				bw.write(input2.substring(0,1)+input2.substring(input2.length()-1,input2.length()));
				bw.newLine();
			}
			bw.flush();
			bw.close();
			br.close();
		}
	}
