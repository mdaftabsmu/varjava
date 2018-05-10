package in.varjava.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringDateArrange {
	
	public static void main(String[] args) {
		List<String> datestring=new ArrayList<String>();
		datestring.add("01/21/2013 @03:13 PM");
		datestring.add("01/21/2013 @04:37 PM");
		datestring.add("01/21/2013 @10:41 AM");
		datestring.add("01/21/2013 @10:48 AM");
		datestring.add("01/22/2013 @06:16 AM");
		datestring.add("01/22/2013 @06:19 AM");
		datestring.add("01/21/2013 @05:19 PM");
		datestring.add("01/21/2013 @05:19 PM");
		// dateParser(datestring);
		 java8Parser(datestring);
		 
		
	}

	private static void printDate(List<String> datestring) {
		for (String s : datestring)
		 {
		     System.out.println(s);
		 }
	}

	private static void dateParser(List<String> datestring) {
		Collections.sort(datestring, new Comparator<String>() {
		        DateFormat f = new SimpleDateFormat("MM/dd/yyyy '@'hh:mm a");
		        @Override
		        public int compare(String o1, String o2) {
		            try {
		                return f.parse(o1).compareTo(f.parse(o2));
		            } catch (ParseException e) {
		                throw new IllegalArgumentException(e);
		            }
		        }
		    });
		 printDate(datestring);
	}

	private static void java8Parser(List<String> datestring) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy '@'hh:mm a");
		    Collections.sort(datestring, (s1, s2) -> LocalDateTime.parse(s1, formatter).
		            compareTo(LocalDateTime.parse(s2, formatter)));
		    printDate(datestring);
	}

}
