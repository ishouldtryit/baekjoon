package beakjoonStep006;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_02_3003 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			String[] inputs = input.split(" ");
			int[] chess = {1,1,2,2,2,8};
			int[] result = new int[6];
			for(int a=0; a<chess.length; a++ ) {
				result[a] = chess[a]-Integer.parseInt(inputs[a]);
			}
			for(int b=0; b<result.length; b++) {
				bw.write(result[b]+" ");
			}
			
		
			bw.flush();
			bw.close();
			br.close();
		}
	}
