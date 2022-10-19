import java.io.*;
import java.util.*;

public class boj1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] num = br.readLine().split("");
		int[] nums = new int[num.length];
		
		for (int i = 0; i < num.length; i++) {
			nums[i] = Integer.parseInt(num[i]);
		}
		
		Arrays.sort(nums);
		
		for (int i = nums.length-1; i >= 0; i--) {
			sb.append(nums[i]);
		}
		
		sb.append("\n");
		System.out.println(sb);
	}

}
