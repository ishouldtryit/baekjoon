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
			int x = input;
			int y = 0;
			for(int a=0; a<num; a++) {
				x--;
				y=0;
				space = Math.abs(x);
				star = input-space-1;
				y += 2*star+1;
				for(int c=0; c<space; c++) {
					bw.write(" ");
				}
				for(int d=0; d<y; d++) {
					bw.write("*");
				}
				
				bw.newLine();
			}
		
			bw.flush();
			bw.close();
			br.close();
		}
	}
