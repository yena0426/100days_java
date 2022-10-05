import java.io.*;
import java.util.*;

public class boj10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int[] abc = new int[26];
		Arrays.fill(abc, -1);
				
		for (int i = 0; i < word.length(); i++) {
			int letter = (int)word.charAt(i) - 97;
			if (abc[letter] == -1) {
				abc[letter] = i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int a : abc) {
			sb.append(a+" ");
		}
		System.out.println(sb);
	}

}
