package tweet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tweet {
	
	String message;
	Date date;
	
	Tweet(String message) {
		this.message = message;
		this.date = new Date();
	}
	
	void print() {
		System.out.print(message);
		// System.out.print(date);
		System.out.print(" ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String strDate = sdf.format(this.date);
		System.out.print(strDate);
		System.out.println();
	}
	
}
