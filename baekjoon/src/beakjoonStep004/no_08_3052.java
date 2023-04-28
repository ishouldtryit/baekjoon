	package beakjoonStep004;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
import java.util.ArrayList;
	
	public class no_08_3052 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
			ArrayList<Integer> list = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			
			for(int i=0; i<10; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			
			for(int a=0; a<10; a++) {
				list2.add(list.get(a)%42);
			}
			
			for(int b=0; b<10; b++) {
				
			}
			
			
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
