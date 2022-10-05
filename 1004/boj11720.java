import java.io.*;

public class boj11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		String[] nums = br.readLine().split("");
		int tmp;
		for (String num : nums) {
			tmp = Integer.parseInt(num);
			sum += tmp;
		}
		System.out.println(sum);
	}

}
