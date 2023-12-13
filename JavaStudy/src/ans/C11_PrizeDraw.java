package ans;

import myobj.prizedraw.DrawMachine;
import myobj.prizedraw.Prize;

public class C11_PrizeDraw {

	public static void main(String[] args) {
		DrawMachine d = new DrawMachine(
				new Prize[] { new Prize("TV", 30, 0.1), 
						new Prize("노트북", 10, 0.05), 
						new Prize("츄파츕스", 1000, 0.3) });

		for (int i = 0; i < 100; i++) {
			System.out.println(d.draw());
		}
	}
}
