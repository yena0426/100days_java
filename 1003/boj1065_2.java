import java.io.*;

public class boj1065_2 {
	
	public static int hannum(int n) {
		int tmp = n % 10;
		n /= 10;
		int gap = n % 10 - tmp;
		while (n >= 10) {
			tmp = n % 10;
			n /= 10;
			if (gap != n % 10 - tmp) return 0;
		}
		return 1;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		if (n < 100) {
			ans = n;
		} else {
			for (int i = 100; i <= n; i++) {
				ans += hannum(i);
			}
			ans += 99;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(ans+"\n");
		bw.flush();
		bw.close();
	}

}
