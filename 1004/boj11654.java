import java.io.*;

public class boj11654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char letter = br.readLine().charAt(0);
		int ans = (int)letter;
		
		sb.append(ans);
		
		System.out.println(sb);
	}

}
