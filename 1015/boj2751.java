import java.io.*;
import java.util.*;

public class boj2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[T];
		
		for (int i = 0; i < T; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(nums);
		
		for (int i = 0; i < T; i++) {
			sb.append(nums[i]+"\n");
		}
 
		System.out.println(sb);
	}
}