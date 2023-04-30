package beakjoonStep005;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_07_2675 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int input = Integer.parseInt(br.readLine());
			String input2 =null;
			String[] inputs = null;
			int num=0;
			String s = null;
			for(int a=0; a<input; a++) {
				input2 = br.readLine();
				inputs = input2.split(" ");
				num=Integer.parseInt(inputs[0]);
				s=inputs[1];
				for(int b=0; b<s.length(); b++) {
					for(int d=0; d<num; d++) {
						bw.write(String.valueOf(s.charAt(b)));
					}
				}
				bw.newLine();
			}
			bw.flush();
			bw.close();
			br.close();
		}
	}
