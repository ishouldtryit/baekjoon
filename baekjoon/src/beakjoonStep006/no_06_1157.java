package beakjoonStep006;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
	
	public class no_06_1157{
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine().toUpperCase();
			Map<Character, Integer> map = new HashMap<>();
			for(int a=0; a<input.length(); a++) {
				if(map.containsKey(input.charAt(a))) {
					map.put(input.charAt(a), map.get(input.charAt(a))+1);
				}else {
					map.put(input.charAt(a), 1);
				}
			}
			int max=0;
			char c = 0;
			int count =0;
			
			for(Map.Entry<Character, Integer> entry : map.entrySet() ) {
				if(entry.getValue()>max) {
					max=entry.getValue();
					c = entry.getKey();
					count = 1;
				}else if(entry.getValue()==max) {
					count++;
				}
			} 
			
			String result = (count > 1) ? "?" : String.valueOf(c);
			
			bw.write(result);
			bw.flush();
			bw.close();
			br.close();
		}
	}
