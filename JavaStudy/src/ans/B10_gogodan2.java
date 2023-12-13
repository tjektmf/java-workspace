package ans;

public class B10_gogodan2 {
	
	public static void main(String[] args) {
		
		int gop2 = 1;
		
		while (gop2 <=9) {
			int dan2 = 2;
			while (dan2 <=9) {
				System.out.printf("%dx%d=%d\t", dan2, gop2, dan2*gop2);
				dan2++;
			}
			System.out.println();
			gop2++;
		}
	}

}
