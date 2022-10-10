import java.io.*;
import java.util.*;

public class boj1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
 
		long cnt = 0L;
		if (B >= C) {
			cnt = -1;
		} else {
			long tmp = C+1;
			while (tmp >= C) {
				++cnt;
				tmp = (A + B*cnt) / cnt;
			}
		}
		System.out.println(cnt);
	}

}
