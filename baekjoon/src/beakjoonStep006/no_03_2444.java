package beakjoonStep006;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_03_2444 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int input = Integer.parseInt(br.readLine());
			int num = 2*input-1;
			int space = 0;
			int star = 0;
			for(int a=0; a<num; a++) {
				space = input-a-1;
				star = a*2+1;

				for(int b=0; b<space; b++) {
					bw.write(" ");
				}
				for(int c=0; c<star; c++) {
					bw.write("*");
				}
				bw.newLine();
			}
		
			bw.flush();
			bw.close();
			br.close();
		}
	}
