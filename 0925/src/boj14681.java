import java.util.Scanner;

public class boj14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int quadrant;
		
		if (x>0 && y>0) {
			quadrant = 1;
		} else if (x<0 && y>0) {
			quadrant = 2;
		} else if (x<0 && y<0) {
			quadrant = 3;
		} else {
			quadrant = 4;
		}
		
		System.out.println(quadrant);
	}

}