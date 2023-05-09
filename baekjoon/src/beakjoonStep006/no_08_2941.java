package beakjoonStep006;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_08_2941{
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int input = Integer.parseInt(br.readLine());
			for(int c=0; c<input; c++) {
				
			String input2 = br.readLine();
			String[] inputs2 = input2.split(" ");
			int student = Integer.parseInt(inputs2[0]);
			int[] inputs3 = new int[inputs2.length-1];
			int total = 0;
			for(int a=1; a<inputs2.length; a++) {
				inputs3[a-1] = Integer.parseInt(inputs2[a]);
				total += Integer.parseInt(inputs2[a]);
			}
			double average = (double)total/student;
			int count=0;
			for(int b=0; b<inputs3.length; b++) {
				if((double)inputs3[b]>average) {
					count++;
				}
			}
			double result = (double)count/student*100.0;
			
			System.out.println(String.format("%.3f", result)+"%");
			}
			
			bw.close();
			br.close();
		}
	}
