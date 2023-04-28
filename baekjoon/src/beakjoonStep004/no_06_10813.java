	package beakjoonStep004;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	
	public class no_06_10813 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
			String input = br.readLine();
			String []inputs = input.split(" ");
			int n = Integer.parseInt(inputs[0]);
			int m = Integer.parseInt(inputs[1]);
			
			int[] list = new int[n];
			
			for(int a=0; a<n; a++) {
				list[a] = a+1;
			}
			int save=0;
			for(int b=0; b<m; b++) {
				String input2 = br.readLine();
				String [] inputs2 = input2.split(" ");
				int i = Integer.parseInt(inputs2[0])-1;
				int j = Integer.parseInt(inputs2[1])-1;
				save = list[i];
				list[i] = list[j];
				list[j] = save;
			}
			for(int c=0; c<n; c++) {
				bw.write(list[c]+" ");
			}
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
