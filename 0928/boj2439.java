import java.io.*;

public class boj2439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		char star = '*';
		
		for (int i = 1; i <= T; i++) {
			for (int j = 1; j <= T-i; j++) {
				bw.write(' ');
			}
			for (int k = 1; k <= i; k++) {
				bw.write(star);
			}
			bw.newLine();
		}
			bw.flush();
			bw.close();
	}

}