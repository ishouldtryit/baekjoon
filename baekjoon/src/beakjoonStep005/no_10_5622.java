package beakjoonStep005;
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
	
	public class no_10_5622 {
	
		public static void main(String[] args) throws IOException {
			
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String input = br.readLine();
			int sec = 0;
			String s = null;
			for(int a=0; a<input.length(); a++) {
				s= String.valueOf(input.charAt(a));
				if(s.equals("A")||s.equals("B")||s.equals("C")) {
					sec += 3;
				}
				if(s.equals("D")||s.equals("E")||s.equals("F")) {
					sec += 4;
				}
				if(s.equals("G")||s.equals("H")||s.equals("I")) {
					sec += 5;
				}
				if(s.equals("J")||s.equals("K")||s.equals("L")) {
					sec += 6;
				}
				if(s.equals("M")||s.equals("N")||s.equals("O")) {
					sec += 7;
				}
				if(s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("S")) {
					sec += 8;
				}
				if(s.equals("T")||s.equals("U")||s.equals("V")) {
					sec += 9;
				}
				if(s.equals("W")||s.equals("X")||s.equals("Y")||s.equals("Z")) {
					sec += 10;
				}
			}
			bw.write(String.valueOf(sec));
			
			bw.flush();
			bw.close();
			br.close();
		}
	}
