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
				list.add(Integer.parseInt(br.readLine())%42);
			}
			
			for(int a=0; a<10; a++) {
				int count = 0;
				for(int b=0; b<list2.size(); b++) {
					if(list.get(a)!=list2.get(b)) {
						count++;
					}
				}
				if(count==list2.size()) {
					list2.add(list.get(a));
				}
			}
			bw.write(String.valueOf(list2.size()));
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
