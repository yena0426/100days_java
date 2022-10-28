import java.io.*;

public class boj1181 {

	public static String[] merge_sort(String[] lst) {
		if (lst.length == 1) {
			return lst;
		}
		int middle = lst.length/2;
		String[] left = new String[middle];
		String[] right = new String[lst.length-middle];
		System.arraycopy(lst, 0, left, 0, middle);
		System.arraycopy(lst, middle, right, 0, lst.length-middle);
		left = merge_sort(left);
		right = merge_sort(right);
		return merge(left, right);
	}
	
	public static String[] merge(String[] left, String[] right) {
		int l_idx = 0;
		int r_idx = 0;
		String[] result = new String[left.length+right.length];
		int idx = 0;
		while (idx < left.length+right.length) {
			if (r_idx == right.length) {
				result[idx] = left[l_idx];
				l_idx++;
			} else if (l_idx == left.length) {
				result[idx] = right[r_idx];
				r_idx++;
			} else if (left[l_idx].length() == right[r_idx].length()) {
				for (int i = 0; i <= left[l_idx].length(); i++) {
					if (i == left[l_idx].length() || left[l_idx].charAt(i) < right[r_idx].charAt(i)) {
						result[idx] = left[l_idx];
						l_idx++;
						break;
					} else if (left[l_idx].charAt(i) > right[r_idx].charAt(i)) {
						result[idx] = right[r_idx];
						r_idx++;
						break;
					}
				}
			} else if (left[l_idx].length() < right[r_idx].length()) {
				result[idx] = left[l_idx];
				l_idx++;
			} else {
				result[idx] = right[r_idx];
				r_idx++;
			}
			idx++;
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N= Integer.parseInt(br.readLine());
		String[] words = new String[N];
		
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine().trim();
		}
				
		String[] sort_words = merge_sort(words);
		
		sb.append(sort_words[0]).append("\n");
		int tmp = 0;
		for (int i = 1; i < N; i++) {
			if (sort_words[i].toString() != sort_words[tmp].toString()) {
				System.out.println(sort_words[tmp]+ " " +sort_words[i]);
				sb.append(sort_words[i]).append("\n");
				tmp = i;
			}
		}
 
		System.out.println(sb);
	}
}