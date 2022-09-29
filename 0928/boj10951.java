import java.io.*;
import java.util.*;

public class boj10951 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
				
		while (true) {
			if (st.hasMoreTokens() == false) {
				break;
			} else {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				bw.write((a+b)+"\n");
			}
			st = new StringTokenizer(br.readLine()," ");
		}
			bw.flush();
			bw.close();
	}

}
