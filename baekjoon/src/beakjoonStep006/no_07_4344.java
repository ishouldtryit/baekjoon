package beakjoonStep006;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_07_4344{
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input2 = br.readLine();

			String [] check = {"c=","c-","dz=","d-","lj","nj","s=","z="};
			
			System.out.println(check[0]);
			
			int find = input2.indexOf("as");
			
			System.out.println(find);
			
			bw.close();
			br.close();
		}
	}
