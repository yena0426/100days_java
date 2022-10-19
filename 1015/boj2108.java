import java.io.*;
import java.util.*;

//������ : N���� ������ ���� N���� ���� ��
//�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
//�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
//���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����


public class boj2108 {
	
	public static int func1(int[] lst) {
		int sum = 0;
		for (int l : lst) {
			sum += l;
		}
		int avg = sum/lst.length;
		return avg;
	}
	
	public static int func2(int[] lst) {
		Arrays.sort(lst);
		return lst[lst.length/2];
	}
	
	public static int func3(int[] lst) {
		int[] cnt = new int[8001];
		int maxcnt = 0;
		for (int l : lst) {
			cnt[l+4000] += 1;
			maxcnt = 
		}
	}
	
	public static int func4(int[] lst) {
		int minn = 4001;
		int maxn = -4001;
		for (int l : lst) {
			minn = (l < minn) ? l : minn;
			maxn = (l > maxn) ? l : maxn;
		}
		return maxn - minn;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
				
		sb.append(func1(nums)).append(func2(nums)).append(func3(nums)).append(func4(nums)).append("\n");
		System.out.println(sb);
	}
	
}
