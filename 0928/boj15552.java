import java.io.*;
import java.util.StringTokenizer;

public class boj15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write(a+b+"\n");

		}
			bw.flush();
			bw.close();
	}

}
