package ans;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import quiz.D10_ReporterList;

public class E04_EmailListFile {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("myfiles/emails.txt");
			
			String email = ".+@.+";
			Matcher matcher = Pattern.compile(email).matcher(D10_ReporterList.emails); 
			// 타클래스 필드를 가져올때 굳이 인스턴스 안만들어도댐
			
			while(matcher.find()) {
				out.write(matcher.group().getBytes());
				out.write('\n');
			}
			
			
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
