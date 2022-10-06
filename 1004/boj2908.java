import java.io.*;

public class boj2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		int bigger = 0;
		for (String n : nums) {
			String num = "";
			for (int i = 0; i < 3; i++) {
				num += n.charAt(3-i-1);
			}
			int tmp = Integer.parseInt(num);
			if (tmp > bigger) {
				bigger = tmp;
			}
		}
		System.out.println(bigger);
	}

}
