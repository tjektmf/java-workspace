import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Helo2 {

	public static void main(String[] args) throws IOException {
		{
			String str = "aasbbzccsddzeesffzgg";
			StringTokenizer st = new StringTokenizer(str, "sz"); // s z두개로 구분

			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		bw.close();
	}

}
