package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04_EmailListFile {

	// D10 기자들의 이메일들로만 이루어진 파일을 myfiles밑에 생성

	public static void main(String[] args) {
		D10_ReporterList d10 = new D10_ReporterList();

		String email = ".+@.+";
		Matcher matcher = Pattern.compile(email).matcher(d10.emails);
		// 

		List<String> list = new ArrayList<>();
		while (matcher.find()) {
			list.add(matcher.group()+"\n");
		}
	//	System.out.println(list);
		
		try {
			FileOutputStream out = new FileOutputStream("myfiles/emaillist.txt");
			
			for(String lists : list) {
			
			out.write(lists.getBytes());
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
