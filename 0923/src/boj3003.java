import java.util.Scanner;

public class boj3003 {

	public static void main(String[] args) {
		// ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8��
		
		Scanner sc = new Scanner(System.in);
		
		int king, queen, rook, bishop, knight, pawn;
		
		king = 1-sc.nextInt();
		queen = 1-sc.nextInt();
		rook = 2-sc.nextInt();
		bishop = 2-sc.nextInt();
		knight = 2-sc.nextInt();
		pawn = 8-sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", king, queen, rook, bishop, knight, pawn);
	}

}
