import java.io.*;
import java.util.*;

public class boj1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
				
		for (int i = M; i <= N; i++) {
			if (i != 1 && i % 2 == 1) {
				boolean prime = true;
				for (int j = 3; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						prime = false;
						break;
					}
				}
				if (prime == true) {
					sb.append(i+"\n");
				}
			} else if (i == 2) {
				sb.append(i+"\n");
			}
		}
		System.out.print(sb);
	}

}
