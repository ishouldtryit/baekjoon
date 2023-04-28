	package beakjoonStep004;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
import java.util.ArrayList;
	
	public class no_07_5597 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
			ArrayList<Integer> list = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			for(int i=0; i<28; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			for(int b=0; b<30; b++) {
				int count=0;
				for(int c=0; c<28; c++) {
					if(list.get(c)!=b+1) {
						count++;
						if(count==28) {
							list2.add(b+1);
						}
					}
				}
			}

			if(list2.get(0)>list2.get(1)) {
				bw.write(String.valueOf(list2.get(1)));
				bw.newLine();
				bw.write(String.valueOf(list2.get(0)));
			}else {
				bw.write(String.valueOf(list2.get(0)));
				bw.newLine();
				bw.write(String.valueOf(list2.get(1)));
			}
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
