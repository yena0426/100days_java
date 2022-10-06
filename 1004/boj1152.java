import java.io.*;
import java.util.*;

public class boj1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
	}

}
