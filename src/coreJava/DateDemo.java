package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		// print current date and time
		
		Date d = new Date();
		System.out.println(d.toString()); // o/p: Sat Apr 04 19:38:13 IST 2026
		
		// if i want to print custom date n time like dd/mm/yyyy
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d)); // o/p: 4/04/2026
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(d)); // o/p: 4/4/2026 07:40:28
		
	}

}
